package after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class ReverseTheString implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.compareTo(arg0);
	}
	
}

public class ComparatorUse {

	public static void main(String[] args) {

		ReverseTheString reverseObj=new ReverseTheString();
	
		
		String[] names ={"Clex","Dlex","Blex","Alex"};
		
		System.out.print("Contents of Names: ");
		for(String elements: names)
			System.out.print(elements+" ");
		
		Arrays.sort(names);
		System.out.print("\nContents of Names: ");
		for(String elements: names)
			System.out.print(elements+" ");
		
		Arrays.sort(names,reverseObj);
		System.out.print("\nContents of Names: ");
		for(String elements: names)
			System.out.print(elements+" ");
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Clex");
		al.add("Dlex");
		al.add("Blex");
		al.add("Alex");
		
		System.out.println("\nContents of list: "+al);
		Collections.sort(al);
		System.out.println("\nContents of list: "+al);
		Collections.sort(al,reverseObj);
		System.out.println("\nContents of list: "+al);
		
		
		
	}

}
