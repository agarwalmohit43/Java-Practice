package check;

interface Printable{  
void print();  
}  
interface Showable{  
void show();  
void print();
}  

public class multipleInheritance implements Printable,Showable{

	public static void main(String[] args) {

		multipleInheritance obj=new multipleInheritance();
		obj.print();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("Show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}
	
	
	

}
