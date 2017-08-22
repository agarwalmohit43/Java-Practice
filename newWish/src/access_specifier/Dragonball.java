package access_specifier;

import java.io.ObjectInputStream.GetField;
import java.util.Random;

public class Dragonball {

	static int ballCount=0;
	static int getCount;
	static int ramdom;
	
	static void iFoundaBall(){

		ballCount++;
	}
	
	static void iLostball(){
		
		
		Random ram=new Random();
		 ramdom=ram.nextInt((ballCount-0)+1)+0;
		
		 if(ramdom>ballCount){
			 ballCount=ramdom-ballCount;
		 }else{
			 ballCount=ballCount-ramdom;
		 }
	}
	public static void main(String[] args) {

		iFoundaBall();
		iLostball();

		if(ballCount==7){
			System.out.println("You can ask your wish is printed");
			ballCount=0;
		}
		
		
	}

}
