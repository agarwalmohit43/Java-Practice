package after;

public class ObjectPlaying {

	public static void main(String[] args) {

		objA obj=new objA();
		System.out.println(obj);
		System.out.println(obj.x);
		obj.x=100;
		System.out.println(obj.x);
		
		objB objb=new objB();
		objb.methodB(obj);
		System.out.println(obj.x);
	}

}

class objA{
	static int x=800;
}

class objB{
	public void methodB(objA obj){
		System.out.println(obj);
		System.out.println(obj.x);
		obj.x=500;
		obj=null;
		System.out.println("K "+obj);
		System.out.println(obj.x);//null
	}
}
