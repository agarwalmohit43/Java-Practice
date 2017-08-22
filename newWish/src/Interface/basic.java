package Interface;

interface mohit{
	int i=5;
	void hello();
}
public class basic implements mohit{

	public static void main(String[] args) {

		basic b=new basic();
		b.hello();
		System.out.println("Hi Mohit : "+b.i);
		
	}

	public void hello() {
		System.out.println("Hi Java");
	}

}
