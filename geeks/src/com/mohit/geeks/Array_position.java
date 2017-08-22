package com.mohit.geeks;

import java.util.Scanner;

public class Array_position {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		int n,pos,val;
		int arr[]=new int[50];
		System.out.println("Enter the no. of values to be entered: ");
		n=in.nextInt();
		
		System.out.println("Array initialisation: ");
		for(int i=0;i<n;i++){
			System.out.println("Enter the "+(i+1)+" element");
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the position: ");
		pos=in.nextInt();
		System.out.println("Enter the value: ");
		val=in.nextInt();
		
		for(int j=n;j>=pos;j--){
			arr[j]=arr[j-1];
		}
		arr[pos-1]=val;
		System.out.println("Array: ");
		for(int k=0;k<=n;k++){
			System.out.print(arr[k]+" ");
		}
	}
	
	
	

}
