package Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Practice {

	public static void main(String[] args) {

		try {
			ServerSocket ss=new ServerSocket(3333);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			String str="",str2="";
			while(!str.equals("stop")){
				str=din.readUTF();
				System.out.println("Client Says: "+str);
				str2=br.readLine();
				dout.writeUTF(str2);
				dout.flush();
				
				
			}
			
			din.close();
			dout.close();
			s.close();
			ss.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
