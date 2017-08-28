package after;

class Address{
	String City;
	String State;
	String Country;

	public Address(String city, String state, String country) {
		City = city;
		State = state;
		Country = country;
	}
}
class Emp{
	int id;
	String name;
	Address address;
	
	Emp(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void dis() {
			System.out.println("Emp Id: "+id+"\nEmp Name: "+name+"\nAddress: "+address.City+", "+address.State+", "+address.Country);
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Address obj=new Address("Dhanbad","Jharkhand","India");
		Emp empObj=new Emp(119796, "Mohit", obj);
		empObj.dis();
	}

}
