
package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.*;

public class GetRequest {

	private static String GET_URL="http://localhost:8080/StudentAdmisionForm/students";
	
	public static void main(String[] args) throws IOException, JSONException {

		try {
			URL url =new URL(GET_URL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + url);
			System.out.println("Response Code : " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) {

				BufferedReader br =new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				String inputLine;
				StringBuffer response=new StringBuffer("");
				
				while((inputLine=br.readLine())!=null){
					response.append(inputLine);
				}
				br.close();
				
				System.out.println(response);
				
				/*JSONObject jsonObj = new JSONObject(response.toString());
				
				System.out.println("JSON WORKING");
				System.out.println("Name: "+jsonObj.getString("student_name"));*/
				
				JSONArray jsonarray = new JSONArray(response.toString());
				System.out.println("Total Number of elements: "+jsonarray.length());
				
				for (int i = 0; i < jsonarray.length(); i++) {
				    JSONObject jsonobject = jsonarray.getJSONObject(i);
				    String name = jsonobject.getString("student_name");
				    
				    System.out.println("Student Name: "+name);
				}
				
				
				
			}else
			{
				System.out.println("Get Request Error");
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}