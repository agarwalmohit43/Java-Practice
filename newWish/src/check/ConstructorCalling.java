package check;
class Constr{

	public Constr() {
		System.out.println("Constructor called");
	}
	
}

public class ConstructorCalling {

	public static void main(String[] args) {

		Constr con=new Constr();
		String a="s ";
		int sum=1+2;
		int y;
		{
			y=5;
		}
		System.out.println(a+sum+y/5);
		
		int aa=10+20/2;
		System.out.println(aa);
	}

}
