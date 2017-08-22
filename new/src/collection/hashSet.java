package collection;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {

		HashSet hs=new HashSet();
		hs.add("M");
		hs.add("o");
		hs.add("h");
		hs.add("i");
		hs.add("t");
		if(hs.add("Z")){
			System.out.println("No");
		}else{
			System.out.println("yes");
		}
		System.out.println(hs);

	}

}
