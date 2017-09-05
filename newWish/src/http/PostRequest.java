package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class PostRequest {

	private static String POST_URL = "http://localhost:8080/StudentAdmisionForm/studentNew";
	
	
	public static void main(String[] args) throws IOException {
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("student_name","Mohit");
		map.put("studenthobby", "Coding");
		
		JSONObject jsonObj = new JSONObject(map);
		System.out.println("JSON:\n"+jsonObj.toString());
		
		
		try {
			URL url = new URL(POST_URL);
			HttpURLConnection con =(HttpURLConnection)url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
			os.write(jsonObj.toString().getBytes());
			os.flush();
			os.close();
			
			

			int responseCode = con.getResponseCode();
			System.out.println("POST Response Code :: " + responseCode);
			
			
			
			if (responseCode == HttpURLConnection.HTTP_CREATED) { 
				
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				// print result
				System.out.println(response.toString());
			
			}else{
				System.out.println("Post Request Error");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
