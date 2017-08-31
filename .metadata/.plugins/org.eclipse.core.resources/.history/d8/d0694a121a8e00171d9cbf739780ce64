package com.mohit.student;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType.*;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MethodType;

@RestController
public class StudentRestAPIController {

	/*@ResponseBody is not used when using class as restcontroller it tells all method automatic about rest*/
	@RequestMapping(value= "/students", method=RequestMethod.GET, produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student> studentInfo(){
	
		Student student1=new Student();
		student1.setStudentname("Mohit");
		
		Student student2=new Student();
		student2.setStudentname("Kumar");
		
		Student student3=new Student();
		student3.setStudentname("Ram");
		
		Student student4=new Student();
		student4.setStudentname("Shyam");
		
		ArrayList<Student> studentList=new ArrayList<Student>();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		
		return studentList;
	}
	
	@RequestMapping(value="/student/{name}",method=RequestMethod.GET,produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent(@PathVariable("name") String name){
		
		Student student=new Student();
		student.setStudentname(name);
		student.setStudenthobby("Coding");
		
		return student;
	}
}
