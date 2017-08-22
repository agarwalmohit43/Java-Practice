package com.mohit.geeks;

import java.lang.*;

class finalclass{
	int i=10;
	
	
}

public class finalandobj {

	public static void main(String[] args) {

		final finalclass obj=new finalclass();
		obj.i=30;
		System.out.println("Value Of I: "+obj.i);
		obj.i=20;
		System.out.println("Value Of I: "+obj.i);
		int a=10;
		
		System.out.println('M'+'O'+'H'+'I'+'T');
		
		String m=new String("MOHIT Agarwal");
		System.out.println("Index of Agarwal: "+m.substring(0,5));
	}

}

