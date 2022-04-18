package br.com.letscode.distribuida.utils;

import br.com.letscode.distribuida.annotation.Mascara;

import javax.swing.text.MaskFormatter;
import java.lang.reflect.Field;
import java.text.ParseException;

public class MascaraUtil {

    public void aplicarMascara(final Object objeto){

        Class<?> classe = objeto.getClass();

        Field[] atributos = classe.getDeclaredFields();
        classe.get
        for(Field atributo: atributos) {
            if (atributo.isAnnotationPresent(Mascara.class)) {

                Mascara mascara = atributo.getAnnotation(Mascara.class);
                String padraoMascara = mascara.pattern();

                atributo.setAccessible(true);

                try {
                    String valorDoAtributo = (String) atributo.get(objeto);
//                    System.out.println(" valor do atributo:  "+valorDoAtributo);
                    String valorComMascara = getValorComMascara(padraoMascara, valorDoAtributo);

                    atributo.set(objeto, valorComMascara);
                } catch (IllegalAccessException | ParseException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private String getValorComMascara(String mascara, String valor) throws ParseException {
        // 111.111.111-11 TODO validar quantidade de caracteres

        MaskFormatter mf = new MaskFormatter(mascara);
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(valor);
    }

}
