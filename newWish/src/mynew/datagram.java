package mynew;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class datagram {

	public static void main(String[] args) throws IOException {

		try {
			DatagramSocket ds=new DatagramSocket();
			String str="Hello Mohit!";
			InetAddress ip = InetAddress.getByName("127.0.0.1");  
		     
		    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
		    ds.send(dp);  
		    ds.close();  
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
