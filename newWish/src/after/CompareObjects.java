package after;

public class CompareObjects {

	int age;
	public static void main(String[] args) {

		CompareObjects obj= new CompareObjects();
		obj.age = 20;
		
		CompareObjects obj2= new CompareObjects();
		obj2.age = 20;
		
		CompareObjects obj3=obj;
		obj3.age = 50;
		
		if(obj.equals(obj2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(obj2 instanceof CompareObjects)
			System.out.println("Equal");
		
		System.out.println(obj.age);
	}

}
