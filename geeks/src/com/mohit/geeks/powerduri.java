package com.mohit.geeks;
import java.util.*;

public class powerduri {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.");
		int x=in.nextInt();
		if(poweroftwo(x)==1){
			System.out.println("Total Fruit: 1");
		}else{
			
		}
	
	}

	private static int poweroftwo(int x) {

		int square=1;
		while(x>=square){
			if (x==square){
				return 1;
			}
			square*=2;
		}
		
		return 0;
	}


}
