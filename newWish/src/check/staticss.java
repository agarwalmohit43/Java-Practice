package check;

class mohitStatics{
	static void sis(){}
}

public class staticss extends mohitStatics{

	protected static void sis(){}
	int aaa=10;
	static int a=5;
	public static void main(String[] args) {
		
		staticss obj=new staticss();
		obj.sum();
		System.out.print(a);
	}
	
	 void sum(){
		a=10;
		
	}

}
