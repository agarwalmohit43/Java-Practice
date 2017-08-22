package thread;

public class basicViaInterface implements Runnable {

	public void run(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {

		basicViaInterface obj= new basicViaInterface();
		Thread t1=new Thread(obj);
		t1.start();
	}

}
