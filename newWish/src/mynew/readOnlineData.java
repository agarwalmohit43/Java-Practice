package mynew;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class readOnlineData {

	public static void main(String[] args) {

		try{
			URL url=new URL("http://127.0.0.1:8888");
			URL url2=new URL("http://www.google.com");
			
			
			
			URLConnection urlcon=url.openConnection();
			InputStream stream=urlcon.getInputStream();
			int read;
			while((read=stream.read())!=-1){
				System.out.print((char)read);
			}
			
			System.out.println();
			HttpURLConnection huc=(HttpURLConnection)url2.openConnection();  
			for(int i=1;i<=8;i++){  
			//System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
			}  
			huc.disconnect();  
			
			/*InetAddress ip=InetAddress.getByName("http://www.google.com"); 
			System.out.println("Host Name: "+ip.getHostName());  
			System.out.println("IP Address: "+ip.getHostAddress());  
			System.out.println();*/
			
		}catch(Exception e){
			
		}
	}

}
