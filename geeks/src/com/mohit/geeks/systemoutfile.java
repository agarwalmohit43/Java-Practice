package com.mohit.geeks;
import java.io.*;

public class systemoutfile {

	public static void main(String[] args) throws FileNotFoundException {

		PrintStream op=new PrintStream(new File("MOhit.txt"));
		
		PrintStream console=System.out;
		System.setOut(op);
		System.out.println("Hi Mohit");
		
		
		System.setOut(console);
		System.out.println("Hi");
	}

}
