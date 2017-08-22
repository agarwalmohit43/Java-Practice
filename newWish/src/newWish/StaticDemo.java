package newWish;

/*class Abc{
	static int i;
	public static void show(){
		System.out.println("Hi : "+i);
	}
}*/

class Counter{
	static int count;
	Counter(){
		count++;
		System.out.println(count);
	}
}

public class StaticDemo {

	static int z=50;
	public static void main(String[] args) {

		
		Counter obj=new Counter();
		Counter obj2=new Counter();
		Counter obj3=new Counter();
		System.out.println(Counter.count);
		StaticDemo ob=new StaticDemo();
		z=z+50;
		ob.display();
		
	}
	
	void display(){
		System.out.println(z);
	}

}
