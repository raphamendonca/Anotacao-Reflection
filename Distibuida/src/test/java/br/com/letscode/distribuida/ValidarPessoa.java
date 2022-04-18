package br.com.letscode.distribuida;

import br.com.letscode.distribuida.model.Pessoa;
import br.com.letscode.distribuida.utils.MascaraUtil;
import org.junit.jupiter.api.Test;

public class ValidarPessoa {

    @Test
    public void testaMascaraPessoa(){
//        Pessoa pessoa = Pessoa.builder()
//                .documento("01234567890")
//                .build();
        Pessoa pessoa = new Pessoa();
        pessoa.setDocumento("01234567890");

        System.out.println("Antes : " + pessoa.getDocumento());

        new MascaraUtil().aplicarMascara(pessoa);
        System.out.println("Depois: " + pessoa.getDocumento());

    }
}
