package check;

public class FactRecursive {

	public static void main(String[] args) {

		System.out.println("Factorial of 5: "+fact(5));
	}

	private static int fact(int i) {

		if(i==1)
			return 1;
		else
			return i*fact(i-1);
	}

}
