package collection;

import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {

		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		System.out.println(hm);
		
		System.out.println(hm.get(4));
		
		TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
		   tm.put("M", 1000);
		   tm.put("CM",900);
		   tm.put("D",500);
		   tm.put("CD",400);
		   tm.put("C",100);
		   tm.put("XC",90);
		   tm.put("L",50);
		   tm.put("XL",40);
		   tm.put("X",10);
		   tm.put("IX",9);
		   tm.put("V",5);
		   tm.put("IV",4);
		   tm.put("I",1);
		   tm.put("I",1);
		   
		   System.out.println(tm.get("M"));
	}

}
