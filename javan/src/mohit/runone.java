package mohit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class runone implements Runnable {

	public void run() {
		try{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("HOW R U");
			String a=in.readLine();
			System.out.println("enter ur lucky no:");
			int b=Integer.parseInt(in.readLine());
			System.out.println(b+" is ur luck no:");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

	

}
