package after;
class Cycle{
	int weight=500;
	public void display(){
		System.out.println("Weight: "+weight);
	}
	
}

class ByCylce extends Cycle{
	
	int height=500;
	public void display(){
		
		System.out.println("Height: "+height);
		super.display();
	}
}
public class Iinheritance {

	public static void main(String[] args) {

		ByCylce obj=new ByCylce();
		obj.display();
	}

}
