package com.mohit.september;

import java.io.FileNotFoundException;

public class ThreadExample extends Thread {

	@Override
	public void run() {
		System.out.println("Run is Runnig");
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		ThreadExample obj=new ThreadExample();
//	obj.start();
		
		try{
			obj.start();
			System.out.println("Inside Try block");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("End of main()");
	}

}
