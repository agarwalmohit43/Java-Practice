package thread;

public class ThreadGroupDemo implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		ThreadGroupDemo runnable=new ThreadGroupDemo();
		
		ThreadGroup tg= new ThreadGroup("Parent thread");
		Thread t=new Thread(tg,runnable,"one");
		t.start();
		
		Thread t2=new Thread(tg,runnable,"two");
		t2.start();
		
		Thread t3=new Thread(tg,runnable,"three");
		t3.start();
		
	}

}
