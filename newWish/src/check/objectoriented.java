package check;

import java.util.ArrayList;

class Address{
	
	String city,state,country; 
	
	public Address(String city, String state, String country) {  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}
}
class Employee{
	
	int empId;
	String Name;
	float salary;
	Address address;
	public Employee(int empId,String Name,float salary,Address address) {
		this.empId=empId;
		this.Name=Name;
		this.salary=salary;
		this.address=address;
	}
	
	void display(){  
		System.out.println(empId+" "+Name+" "+salary);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
	
	
}
public class objectoriented {

	public static void main(String[] args) {

		Address addObj=new Address("Pune", "Maharashtra", "India");
		Employee empObj=new Employee(119,"Mohit", 30000.5f,addObj);
		
		Address addObj2=new Address("Punes", "Maharashtra", "India");
		Employee empObj2=new Employee(119,"Mohit", 30000.5f,addObj2);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(empObj);
		al.add(empObj2);
		
		for(int i=0;i<2;i++){
			al.get(i).display();
		}
		
	}

}
