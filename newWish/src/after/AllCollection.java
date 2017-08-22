package after;

import java.util.ArrayList;
import java.util.Iterator;

public class AllCollection {

	public static void main(String[] args) {

		arrayList();
		linkedList();
	}

	private static void linkedList() {

		
	}

	private static void arrayList() {

		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohit");
		al.add("Agarwal");
		al.add(1,"Kumar");
		
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println("Contains: "+al.contains("Kumar"));
		System.out.println("Get: "+al.get(1));
		System.out.println("LastIndexOf: "+al.lastIndexOf("Agarwal"));
		System.out.println("Remove: "+al.remove(1));

		Iterator<String> it2=al.iterator();
		while(it2.hasNext()){
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		
		al.clear();
		if(al.isEmpty())
			System.out.println("List is empty");
	}

}