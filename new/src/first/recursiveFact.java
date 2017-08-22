package first;

public class recursiveFact {

	public static int fact(int n){
		if(n<=1) return 1;
		int fact =n*fact(n-1);
		return fact;
	}
	public static void main(String[] args) {

		int index=1;
		while(index<=5){
			System.out.println(fact(index));
			index++;
		}
	}

}
