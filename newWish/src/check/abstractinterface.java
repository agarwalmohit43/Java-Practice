package check;


interface AAmmdd{
	void A();
	void B();
	void C();
	void D();
	void E();
}

abstract class B implements AAmmdd{
	public void C(){System.out.println("C");}
	
}
public class abstractinterface extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAmmdd obj=new abstractinterface();
		obj.A();
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub
		System.out.println("A");
		
	}

	@Override
	public void B() {
		// TODO Auto-generated method stub
		System.out.println("B");
	}

	@Override
	public void D() {
		// TODO Auto-generated method stub
		System.out.println("D");
	}

	@Override
	public void E() {
		// TODO Auto-generated method stub
		System.out.println("E");
	}
	
	

}
