package after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Prac {

	public static void main(String[] args) {

		
		Map<Integer,String> map=new HashMap<Integer,String>();
		ArrayList<Object> al = new ArrayList<Object>();
		
		map.put(1,"Mohit");
		map.put(2,"Mohit");
		map.put(3,"Mohit");
		map.put(4,"Mohit");
		map.put(5,"Mohit");
		map.put(6,"Mohit");
		
		
		//Iterating map
		for(Map.Entry<Integer, String> ittr: map.entrySet())
		{
			al.add(ittr.getValue()+" -> "+ittr.getKey());
			System.out.println("Key: "+ittr.getKey()+" Value: "+ittr.getValue()+" Class: "+ittr.getClass()+" Iterator value: "+ittr);
		}
		
		al.add(5);//using Object we can make it generic
		System.out.println(al);
		System.out.println(map);
		
		
	}

}
