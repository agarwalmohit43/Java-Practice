package mohit;

public class runthread {
	public static void main(String[] args)throws Exception{
		Thread a=new Thread( new runone());
		a.start();
		runtwog ob=new runtwog();
		Thread b=new Thread(ob);
		b.start();
		a.join(0);
		ob.end();
		
		
	}
	
	
}
