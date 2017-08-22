package mohit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class one extends Thread {
public void run(){
	
	try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("hi buddy how r u");
		String fine=br.readLine();
		System.out.println("what ru doing");
		String nothing=br.readLine();
	      System.out.println(nothing + " sounds like fun.");


	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
