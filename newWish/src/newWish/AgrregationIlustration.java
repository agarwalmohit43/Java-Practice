package newWish;

import java.io.*;

class Address{
	String locality,city,state;
	
	Address(String locality,String city, String state){
		this.locality=locality;
		this.city=city;
		this.state=state;
	}
}

class Employee{
	int empId;
	String Name;
	Address address;
	
	Employee(int empId, String name,Address address){
		this.empId=empId;
		this.Name=name;
		this.address=address;
	}
	
	void displayMode(){
		System.out.println("Employee ID: " +empId+"\nEmployee Name: "+Name+"\nAddress: "+address.locality+", "+address.city+", "+address.state);
	}
}
public class AgrregationIlustration {

	public static void main(String[] args) {

		Address address=new Address("Bavdhan", "Pune", "Maharashtra");
		Employee e1=new Employee(1234, "Mohit", address);
		e1.displayMode();
		
	}

}
