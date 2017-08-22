package newWish;

import java.util.Scanner;

public class Ambiguity {

	static int add(int a,int b){
		return a+b;
	}
	
	static double add(int a,double b){//change double to int abiguity will occur
		return a+b;
	}
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=add(a,b);
		System.out.println(c);
	}

}
