package com.mohit.geeks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPositionArraylist {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of values to be entered: ");
		int n=in.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				System.out.println("Enter the values to be entered: "+(i+1));
				al.add(in.nextInt());
			}
			int pos,val;
			System.out.println("Enter the position: ");
			pos=in.nextInt();
			System.out.println("Enter the value: ");
			val=in.nextInt();
			
			al.add(pos-1,val);
			System.out.println("Values: "+al);
			
	}

}
