package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {

		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(11);
		l1.add(22);
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.addFirst(0);
		l1.addLast(77);
		System.out.print("Default list Element: "+l1);
		int x=l1.get(6);
		l1.remove(6);
		
		System.out.println("\nAfter removing 6th Element: "+l1);
		
		l1.add(6, x);
		System.out.println("After adding back present element of list: "+l1);
		
		l1.set(0, 0000);
		System.out.println("After setting list Element: "+l1);
		
		Iterator<Integer> itr=l1.listIterator(1);
		System.out.print("List Element from index 1:");
		while(itr.hasNext()){
			System.out.print("\t"+itr.next());
		}
		
		
	}

}
