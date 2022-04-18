package br.com.letscode.distribuida;

import br.com.letscode.distribuida.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;

public class ValidarClasses {

    @Test
    public void validaAnotationNaoImpar(){
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Produto produto = new Produto("Nome", "descricao ", 1, 1);

       Set<ConstraintViolation<Produto>> violations = validator.validate(produto);
        System.out.println(violations.isEmpty());
        Assert.isTrue(violations.isEmpty(), "A quantidade nao deve ser impar");


//        Class<?> produtoClass = produto.getClass();

//        System.out.println(produtoClass.getPackageName());
//        System.out.println(produtoClass.getName());
//        System.out.println(produtoClass.getSimpleName());

//        for(Field field: produtoClass.getDeclaredFields()){
//            for (Annotation annotation: field.getAnnotations()){
//                System.out.println(annotation);
//            }
//        }

//        for(Method method: produtoClass.getMethods()){
//            for(Annotation annotation:  method.getAnnotations()){
//                System.out.println(annotation);
//            }
//        }

//        for(Field atributos: produtoClass.getDeclaredFields()){
//            System.out.println(atributos.getName());
//        }
    }

}
