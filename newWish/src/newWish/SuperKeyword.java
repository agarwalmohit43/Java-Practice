package newWish;

class Person{
	int id;
	String name;
	
	Person(int id, String name){
		this.id=id;
		this.name=name;
	}
}

class Employee2 extends Person{
	float salary;
	
	Employee2(int id,String name,float sal){
		super(id,name);
		salary=sal;
	}
	
	void display(){
		System.out.println(id+"\t"+name+"\t"+salary);
	}
}


public class SuperKeyword {

	public static void main(String[] args) {

		Employee2 e=new Employee2(1234, "MOhit", 20000);
		e.display();
	}

}
