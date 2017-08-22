package Socket;
import java.net.*;
import java.io.*;

public class Serverclass {

	public static void main(String[] args) throws IOException {

		try{
			
			ServerSocket ss=new ServerSocket(6166);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			System.out.println("message= "+str);  
			ss.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
