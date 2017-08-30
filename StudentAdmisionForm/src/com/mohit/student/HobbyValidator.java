package com.mohit.student;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<isValidHobby, String> {
	
	private String listOfHobbies;
	@Override
	public void initialize(isValidHobby isValidHobby) {
		this.listOfHobbies = isValidHobby.listOfHobbies();
	}

	@Override
	public boolean isValid(String studenthobby, ConstraintValidatorContext context) {

		if(studenthobby == null)
			return false;
		
		if(studenthobby.matches(listOfHobbies))
			return true;
		else
			return false;
		
	}

}
