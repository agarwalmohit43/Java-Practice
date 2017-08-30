package com.mohit.student;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String studentname) throws IllegalArgumentException {
		
		if(studentname.contains("Mr.") || studentname.contains("Ms."))
			setValue(studentname);
		else
			setValue("Ms."+studentname);
	}

}
