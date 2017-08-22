package check;

public class FibonacciRecursive {
	 static int n1=0,n2=1,n3=0;  
	public static void main(String[] args) {

		System.out.println("Fibonacci Series for 10 elements: "+fib(10));
		
		//for series
		 int count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		 printFibonacci(count-2);
	}

	private static int fib(int i) {

		if(i==0)
			return 0;
		else if(i==1)
			return 1;
		else
			return fib(i-1)+fib(i-2);
	}
	
	static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    

}
