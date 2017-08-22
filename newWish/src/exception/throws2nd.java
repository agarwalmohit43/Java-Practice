package exception;

import java.io.IOException;

class xyz{
	void method()throws IOException{
		throw new IOException("Exception occured");
	}
}


public class throws2nd {

	public static void main(String[] args) {
		xyz obj=new xyz();
		try {
			obj.method();
			System.out.println("next");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("Rest");
			System.exit(0);
		}
	}

}
