package com.mohit.student;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy= HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface isValidHobby {

	String listOfHobbies() default "Music|Coding";
	
	String message() default "Hobby should be either Coding||Music";
	
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
