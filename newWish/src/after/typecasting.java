package after;
class Person{
	String Name;
	int age;
}

class Student extends Person{
	int rollNumber;
}
public class typecasting {
	public static void main(String[] args) {

		Person obj=new Student();
		obj.age=50;
		obj.Name="Mohit";
		
		if(obj instanceof Student){
			Student s=(Student) obj;
			System.out.println("Working");
			System.out.println(s.age);
		}
		
		
	}

}
