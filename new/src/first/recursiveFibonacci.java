package first;

public class recursiveFibonacci {

	public static long fib(int n){
		if(n==0)return 0;
		if(n<=2)return 1;
		long p=fib(n-1)+fib(n-2);
		
		return p;
	}
	public static void main(String[] args) {

			int index=0;
			while(index <50){
				System.out.print(" "+fib(index));
				index++;
			}
			
	}

}
