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
		
		if(obj==obj2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(obj2 instanceof CompareObjects)
			System.out.println("Equal");
		
		System.out.println(obj);
		
		if(obj.equals(obj2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		System.out.println();
		
		System.out.println("Obj hascode"+obj.hashCode());
		System.out.println("Obj2 hascode"+obj2.hashCode());
		System.out.println("Obj3 hascode"+obj3.hashCode());
	}
	
	@Override
	public String toString() {

		String mo = age+"";
		return mo;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age * 43;
	}

	@Override
	public boolean equals(Object obj) {
		if((obj instanceof CompareObjects) && ((CompareObjects)obj).age == this.age)
			return true;
		else
			return false;
	}
	
	
	
	

}
