package newWish;

class Outer{
	private int data=50;
	class Inner{
		Inner(){
			System.out.print(data);
		}
	}
}


public class outervsinner {

	public static void main(String[] args) {

		Outer obj=new Outer();
		Outer.Inner ob=obj.new Inner();
	}

}
