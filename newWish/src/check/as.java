package check;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
class aa{
	int width;

	int height;

	int length;

}
public class as {

	public static void main(String[] args) {

		aa obj1=new aa();
		aa obj2=new aa();
		obj1.height = 1;

		obj1.length = 2;

		obj1.width = 1;

		obj2 = obj1;

		System.out.println(obj2.height);
		
		StringBuffer s1 = new StringBuffer("one");

		StringBuffer s2 = s1.append("two");
		
		System.out.println(s1);

		Map m=new HashMap<Integer, String>();
		m.put(1, "mohit");
		int i=10;
		
		for(i=0;i<5;i++)
		{
			m.put(1,"s");
		}
		System.out.println(m.get(1));
		System.out.println(i);
		
		float a=3.0f;
		if(a==3.0)
			System.out.println("Yes");
		else
			System.out.println("No");
		
		Date obj=new Date();
		
		System.out.println(obj.getTime());
		System.out.println((int)(Math.random()*100));
		System.out.println();
		unixTime();
		
	}
	
	
	public static void unixTime(){
		/*long unixSeconds = System.currentTimeMillis() / 1000L;;
		Date date = new Date(unixSeconds*1000L); // *1000 is to convert seconds to milliseconds
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z"); // the format of your date
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-4")); // give a timezone reference for formating (see comment at the bottom
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);*/
		
		//Unix seconds
		   Date as=new Date();
		   
		   long dateInLong = as.getTime();
		   //convert seconds to  	 	milliseconds
		   
		   Date date = new Date(); 
		   // format of the date
		   date.setTime(dateInLong);
		   
		   date.setTime(dateInLong -1);
		   
		   long comparisonResult = as.compareTo(date);
		   
		   
		   System.out.println( "Date string... "+ as.toString() + dateInLong + date.toString() + " "  +comparisonResult );	
		   
		   //SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		   //jdf.setTimeZone(TimeZone.getTimeZone("GMT-5:30"));
		   //String java_date = jdf.format(date);
		   
		   
		   
		   
	}

}
