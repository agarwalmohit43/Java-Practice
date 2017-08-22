package Socket;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.*; 

public class Datagramsocket {

	public static void main(String[] args) {

		try{
			
			DatagramSocket ds=new DatagramSocket();
			InetAddress ip=InetAddress.getByName("127.0.0.1");
			String str="Hi Mohit";
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
			ds.send(dp);
			ds.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
