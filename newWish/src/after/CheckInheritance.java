package after;
interface comm{
	int a=5;
	 void checks();
}
abstract class Inherits{
	static int a=5;
	void mohits(){}
	 abstract void get();
}

public class CheckInheritance extends Inherits implements comm{

	static comm co;
	public static void main(String[] args) {
		Inherits.a=10;
		CheckInheritance obj=new CheckInheritance();
		
		co=new CheckInheritance();
		co.checks();
		System.out.println(Inherits.a);
	}
	
	@Override
	void mohits() {
		// TODO Auto-generated method stub
		super.mohits();
	}
	
	@Override
	public void checks() {
		// TODO Auto-generated method stub
		
	}
	void get() {
		// TODO Auto-generated method stub
		
	}

}
