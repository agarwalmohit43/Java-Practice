package mohit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class second extends Thread {
	private static boolean stop = false;

	public void run() {
		   try {
		      int i = 1;
		      double d = 0;
		      while (!stop) {
		         d = Math.log(i++);
		         sleep(1);
		         
		      }
		      System.out.println("The log of " + i + " is " + d);
		      System.out.println("mohit");
		   } 
		   catch (InterruptedException e) {
		      System.out.println("Thread execution was interrupted.");
		   }
		}


public void end() {
	   stop = true;
	}
}
