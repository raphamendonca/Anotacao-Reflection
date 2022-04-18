package br.com.letscode.distribuida.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NaoImparImpl.class)
public @interface NaoImpar {

    String message() default "Valor não pode ser impar";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
