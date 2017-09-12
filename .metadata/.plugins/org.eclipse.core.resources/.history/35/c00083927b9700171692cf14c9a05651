package after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;


public class AllCollection {

	public static void main(String[] args) {

		//List's
		//arrayList();
		//linkedList();
		
		//Set's
		//hashset();
		//treeset();
		
		//Map
		//hashmap();
		//treemap();
		hashtable();
	}

	private static void hashtable() {
		Hashtable<Integer, Integer> hashtable=new Hashtable();
		hashtable.put(1,1);
		hashtable.put(4,1);
		hashtable.put(2,1);
		hashtable.put(5,1);
		for(Map.Entry hasEntry:hashtable.entrySet()){
			System.out.println("Key: "+hasEntry.getKey()+" Value: "+hasEntry.getValue());
		}
	}

	private static void treemap() {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		treeMap.put(1, 1);
		treeMap.put(4, 1);
		treeMap.put(2, 1);
		treeMap.put(3, 1);
		
		
		for(Map.Entry hasEntry:treeMap.entrySet()){
			System.out.println("Key: "+hasEntry.getKey()+" Value: "+hasEntry.getValue());
		}
	}

	private static void hashmap() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Mohit");
		hashMap.put(2, "Kumar");
		
		
		System.out.println("");
		System.out.println("Containskey: "+hashMap.containsKey(1));
		System.out.println("HashMap"+hashMap);
		
		for(Map.Entry hasEntry:hashMap.entrySet()){
			System.out.println("Key: "+hasEntry.getKey()+" Value: "+hasEntry.getValue());
		}
	}

	private static void treeset() {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Mohit");
		treeSet.add("Kumar");
		System.out.println(treeSet);
	}

	private static void hashset() {
		HashSet<String> hashSet = new HashSet<String>();
		System.out.println(hashSet.add("Mohit"));
		System.out.println(hashSet.add("Kumar"));
		System.out.println(hashSet.add("Kumar"));
		
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		System.out.println(hashSet.remove("Kumar"));
		System.out.println(hashSet);
	}

	private static void linkedList() {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Mohit");
		ll.addFirst("Mr.");
		ll.addLast("Agarwal");
		
		System.out.println("LinkedList: "+ll);
		
		System.out.println("LinkedList Contains: "+ll.contains("Mohit"));
		System.out.println("LinkedList GetFirst: "+ll.getFirst());
		System.out.println("LinkedList GetLast: "+ll.getLast());
		System.out.println("LinkedList peek: "+ll.peek());
		System.out.println("LinkedList poll: "+ll.poll());
		System.out.println("LinkedList Size: "+ll.size());
		
		System.out.println("LinkedList: "+ll);
		ll.clear();
		if(ll.isEmpty())
			System.out.println("List is empty");
			
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
