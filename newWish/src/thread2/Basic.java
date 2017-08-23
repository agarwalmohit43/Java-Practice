package thread2;

public class Basic implements Runnable {

	public static void main(String[] args) throws InterruptedException {

		Basic obj=new Basic();
		
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t1.start();
		t1.join();
		t2.start();
		
		
		
		
	}

	@Override
	public void run() {

		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}

}