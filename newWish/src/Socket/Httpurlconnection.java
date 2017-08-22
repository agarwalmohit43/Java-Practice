package Socket;

import java.net.HttpURLConnection;
import java.net.URL;

public class Httpurlconnection {

	public static void main(String[] args) {

		try{
			URL url=new URL("http://www.facebook.com/");
			HttpURLConnection hurl=(HttpURLConnection)url.openConnection();
			for(int i=1;i<=20;i++){  
				System.out.println(hurl.getHeaderFieldKey(i)+ " = "+ hurl.getHeaderField(i));  
				} 
			
			hurl.disconnect();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
