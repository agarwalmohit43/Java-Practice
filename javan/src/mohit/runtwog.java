package mohit;

public class runtwog implements Runnable {

	private static boolean stop=false;
	public void run() {

		try{
			int  c=0;
			while(!stop){
			int a=12;
			int b=4;
			c=a-b;
			Thread.currentThread().sleep(1);;
			}
			System.out.println("value of sub="+c);
			}catch(Exception e){
				e.printStackTrace();
			}
	}

	public void end() {
		stop=true;
	}

}
