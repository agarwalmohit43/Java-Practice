package thread;

public class basic extends Thread {

	@Override
	public void run(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		basic obj=new basic();
		obj.start();
	}

}
