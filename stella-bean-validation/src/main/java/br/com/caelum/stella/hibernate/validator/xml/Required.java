package br.com.caelum.stella.hibernate.validator.xml;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import br.com.caelum.stella.hibernate.validator.xml.logic.StellaRequiredValidator;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD })
@Constraint(validatedBy=StellaRequiredValidator.class)
public @interface Required {

}
