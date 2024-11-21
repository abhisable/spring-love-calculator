package com.abhi.lc.Validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = MyValidator.class)
public @interface Age {

	int lower() default 18;
	int upper() default 45;
	String message() default "age should be between 18 and 45";
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
