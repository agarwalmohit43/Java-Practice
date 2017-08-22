package Socket;

import java.net.InetAddress;

public class Inetexample {

	public static void main(String[] args) {

		try{
			InetAddress ip=InetAddress.getByName("www.gokirana.store");
			System.out.println("Hostname : "+ip.getHostName());
			System.out.println("IP Address : "+ip.getHostAddress());
		}catch(Exception e){
			
		}
	}

}
