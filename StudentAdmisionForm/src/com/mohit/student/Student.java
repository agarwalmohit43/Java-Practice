package com.mohit.student;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"studentmobile"})
@JsonPropertyOrder({"student_name", "studenthobby", "studentmobile", "studentdob", "studentskills", "studentaddress" })
public class Student {

	@JsonProperty("student_name")
	@Pattern(regexp="[^0-9]*")
	private String studentname;
	
	@Size(min=2,max=10) @isValidHobby(listOfHobbies="Music|Coding")
	private String studenthobby;
	private long studentmobile;
	
	@Past
	private Date studentdob;
	private ArrayList<String> studentskills;
	private Address studentaddress;
	
	
	public Address getStudentaddress() {
		return studentaddress;
	}
	public void setStudentaddress(Address studentaddress) {
		this.studentaddress = studentaddress;
	}
	public long getStudentmobile() {
		return studentmobile;
	}
	public void setStudentmobile(long studentmobile) {
		this.studentmobile = studentmobile;
	}
	public Date getStudentdob() {
		return studentdob;
	}
	public void setStudentdob(Date studentdob) {
		this.studentdob = studentdob;
	}
	public ArrayList<String> getStudentskills() {
		return studentskills;
	}
	public void setStudentskills(ArrayList<String> studentskills) {
		this.studentskills = studentskills;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudenthobby() {
		return studenthobby;
	}
	public void setStudenthobby(String studenthobby) {
		this.studenthobby = studenthobby;
	}
	
}
