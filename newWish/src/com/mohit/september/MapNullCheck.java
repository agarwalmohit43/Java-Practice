package com.mohit.september;

import java.util.HashMap;
import java.util.Map;

public class MapNullCheck {

	public static void main(String[] args) {

		Map<Object,Object> hm =new HashMap<Object,Object>();
		
		hm.put(null,"Null");
		hm.put(1,"Null");
		hm.put(null,null);
		
		System.out.println(hm);
	}

}
