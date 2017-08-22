package com.hibernateannotations;
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table; 

@Entity  
@Table(name= "xyz")
public class Employee {
	@Id
	private int Id;
	private String Name;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	
	
	
}
