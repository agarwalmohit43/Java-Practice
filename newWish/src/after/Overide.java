package after;

class OverridesCheck{
	
	public static void display(){
		System.out.println("OverridesCheck Display");
	}
	
	public int add(){
		return 0;
	}
}

public class Overide extends OverridesCheck {
	
	
	public static void display()
	{
		System.out.println("Override Display");
		
	}
	
	@Override
	public int add(){
		return 0;
	}
	
	public static void main(String[] args) {

		OverridesCheck obj=new Overide();
		obj.display();
	}

}
