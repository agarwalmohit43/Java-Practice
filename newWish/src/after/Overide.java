package after;

class OverridesCheck{
	
	public static void display(){
		
	}
	
	public int add(){
		return 0;
	}
}

public class Overide extends OverridesCheck {
	
	
	public static void display()
	{
		
	}
	
	@Override
	public int add(){
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
