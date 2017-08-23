package thread2;

class ThreadA extends Thread{

	int total;
	public void run() {

		for(int i=0;i<10;i++){
			total+=i;
		}
		notify();
	}
	
}

public class ThreadB {

	public static void main(String[] args){
		ThreadA t1=new ThreadA();
		t1.start();
		
		
		synchronized (t1) {
			try{
				System.out.println("Waiting for A to complete");
				t1.wait();
			}catch(InterruptedException e){}
			System.out.println("Total is: "+t1.total);
			
		}
	}
}
