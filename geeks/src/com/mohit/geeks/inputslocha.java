package com.mohit.geeks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;



public class inputslocha {

	public static void main(String[] args) throws IOException {

Scanner in=new Scanner(System.in);

	System.out.println("Enter Ur Full name");
	String s=in.next();
	System.out.println("Your Full Name: "+s);
	System.out.println("Your Full Name: "+s);

	System.out.println("Enter Ur Full name");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String ss=br.readLine();
	System.out.println("Your Full Name: "+ss);
	int a[]={1,2,3};
	Arrays.sort(a);
	int s1=a.length;


	int input1=7;
	       int input2[]={12,11,5,2,7,5,-11};
	       int input3[]={5,12,5,7,11,12,-11};
	       Arrays.sort(input3);
	       Arrays.sort(input2);
	       for(int i=0;i<input1;i++){
	    	   System.out.print(input2[i]+" ");
	    	   
	       }
	       System.out.println();
	       
	       for(int i=0;i<input1;i++){
	    	   System.out.print(input3[i]+" ");
	    	   
	       }
	       
	      if(Arrays.equals(input2, input3)){
	    	  System.out.println("Equla");
	      }else{
	    	  System.out.println("Eadasqula");

	      }
	       
           

	             
	    }
	}
	
