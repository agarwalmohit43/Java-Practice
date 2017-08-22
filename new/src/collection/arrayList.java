package collection;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohit");
		al.add(1, "Agarwal");
		al.add("ILU");
		System.out.print(al.get(0));
		System.out.print("\n"+al.size());
	}

}
