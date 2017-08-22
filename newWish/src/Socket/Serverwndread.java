package Socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverwndread {

	public static void main(String[] args) {

		try{
			ServerSocket ss=new ServerSocket(6766);
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			String str="",str2="";
			while(!str.equals("stop"))
			{
				str=(String)dis.readUTF();
				System.out.println("Client Says: "+str);
				str2=br.readLine();
				dout.writeUTF(str2);
				dout.flush();
				
				
			}
			dis.close();
			dout.close();
			s.close();
			ss.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
