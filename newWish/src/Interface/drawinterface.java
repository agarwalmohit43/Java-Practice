package Interface;

interface shape{
	void draw();
}

class circle implements shape{

	@Override
	public void draw() {

		System.out.println("Drawing Circle");
	}
	
}

class rectangle implements shape{

	@Override
	public void draw() {

		System.out.println("Drawing Rectangle");
	}
	
}

public class drawinterface {

	public static void main(String[] args) {

		shape obj=new circle();
		obj.draw();
		
	}

}
