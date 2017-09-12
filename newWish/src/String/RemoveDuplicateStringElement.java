package String;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateStringElement {

	public static void main(String[] args) {

		String str="geeksforgeeks";
		System.out.println(removeDup(str));// o(nlogn) + ascending order
		System.out.println(removeDupTreeSet(str));// ascending order
		System.out.println(removeDupLinkedHashSet(str));// o(n) , no sorting
		System.out.println(removeDupLicateWithoutExternalDataStructure(str));// no sorting 
	}

	private static String removeDupLicateWithoutExternalDataStructure(String str) {

		String resultant = "";
		
		for(int i = 0; i<str.length();i++)
		{
			if(!resultant.contains(String.valueOf(str.charAt(i))))
			{
				resultant += String.valueOf(str.charAt(i));
			}
		}
		return resultant;
	}

	private static String removeDupLinkedHashSet(String str) {

		Set<Character> lhs = new LinkedHashSet<Character>();
		char temp[] = str.toCharArray();
		for(Character c:temp)
		{
			lhs.add(c);
		}
		str= "";
		for(Character c: lhs)
		{
			str += c;
		}
		
		return str;
	}

	private static String removeDupTreeSet(String str) {

		String finalstr="";
		TreeSet<Character> ts= new TreeSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			ts.add(str.charAt(i));
		}
		
		
		for(Character c: ts)
		{
			finalstr += c;
		}
		
		return finalstr;
	}

	private static String removeDup(String str) {

		char temp[] = str.toCharArray();
		Arrays.sort(temp);
		str = new String(temp);
		return removeDupElements(str);
	}

	private static String removeDupElements(String str) {

		int res_end = 1,ip_end=1;
		
		char arr[]=str.toCharArray();
		while(ip_end != arr.length)
		{
			if(arr[ip_end] != arr[ip_end-1])
			{
				arr[res_end] = arr[ip_end];
				res_end++;
			}
			ip_end++;
		}
		str = new String(arr);
		return str.substring(0,res_end);
		
	}
	
	

}
