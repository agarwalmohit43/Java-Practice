package mohit;

public class threads {
public static void main(String[] args)throws Exception{
	Thread one=new one();
	one.start();
	Thread sec=new second();
	sec.start();
	one.join();
	((second)sec).end();
	
}
}
