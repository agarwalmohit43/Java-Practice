package collection;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(3, "Three");
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(4, "Four");
		hm.put(5, "Five");
		System.out.println(hm);
		
		System.out.println(hm.get(4));
	}

}
