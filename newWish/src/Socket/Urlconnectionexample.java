package Socket;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Urlconnectionexample {

	public static void main(String[] args) {

		try{
			URL url=new URL("http://www.javatpoint.com/java-tutorial");
			URLConnection ucon=url.openConnection();
			InputStream is=ucon.getInputStream();
			int i=0;
			while((i=is.read())!=-1)
			{
				System.out.print((char)i);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
