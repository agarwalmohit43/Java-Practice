package thread;

public class threadwithsleep extends Thread {

	public void run(){
		for(int i=1;i<=5;i++){
			try{
				Thread.sleep(500);
			}catch(InterruptedException m){
				System.out.println(m);
			}
			System.out.println(i+"\t Current Thread: "+Thread.currentThread().getName()+"\tPriority: "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		threadwithsleep t1=new threadwithsleep();
		threadwithsleep t2=new threadwithsleep();
		threadwithsleep t3=new threadwithsleep();
		
		System.out.println("Name of 1st thread: "+t1.getName());
		System.out.println("Name of 2nd thread: "+t2.getName());
		System.out.println("Name of 3rd thread: "+t3.getName());
		System.out.println("Id \n1st: "+t1.getId()+"\n2nd: "+t2.getId()+"\n3rd: "+t3.getId());
		t1.setName("MOHIT AGARWAL");
		System.out.println("Name of 1st thread after changing: "+t1.getName());
		
		t1.start();
		try{
			t1.join(1500);
		}catch(InterruptedException m){
			System.out.println(m);
		}
		t2.start();
		t3.start();
	}

}
