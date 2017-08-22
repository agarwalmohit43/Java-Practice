package check;

public class ContructorCheck {

	int a;
	String b;
	public ContructorCheck() {
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		System.out.println("Value of int: "+a);
		System.out.println("Value of String: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContructorCheck obj=new ContructorCheck();
		obj.display();
	}

}
