package first;

public class recursiveSum {

	public static int Sum(int n){
		if(n==0)return 0;
		int s=n+Sum(n-1);
		return s;
	}
	public static void main(String[] args) {

		System.out.println(Sum(5));
	}

}
