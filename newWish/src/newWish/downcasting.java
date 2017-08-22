package newWish;


class sonu{
	
}


public class downcasting extends sonu {

	static void method(sonu a){
		if(a instanceof downcasting){
			downcasting d=(downcasting)a;
			System.out.println("Downcasting performed");
			
			System.out.println(a instanceof downcasting);
		}
	}
	
	public static void main(String[] args) {

		downcasting d=new downcasting();
		d.method(d);
		
	}

}
