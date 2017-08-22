package com.mohit.geeks;

import java.util.Scanner;

public class primenologic {

	public static void main(String[] args) {

		boolean flag=false;
		System.out.println("Enter the no.:");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		for(int i=2;i<=Math.sqrt(x);i++){
			
			if(x%i==0){
				flag=true;
				System.out.println(" Not Prime");
				break;

			}
		}
		if(!flag){
			System.out.println("Prime");
		
	}

}}
