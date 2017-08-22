package collection;

import java.util.Scanner;
import java.util.TreeMap;

public class practiceSecond {

	static TreeMap<String, Integer> tm=new TreeMap<String, Integer>();
	static int count;
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		   tm.put("M", 1000);
		   tm.put("D",500);
		   tm.put("C",100);
		   tm.put("L",50);
		   tm.put("X",10);
		   tm.put("V",5);
		   tm.put("I",1);
		   
		   System.out.println("Enter the Expression: ");
		   String expression=in.nextLine();
		   
		   String str[]=expression.split(" ");
		   String str1[]=str[0].split("");
		   String str2[]=str[2].split("");

		   int current,next;
		   if(str1.length>1){
			   for(int i=0;i<str1.length;i+=2){
				   current=tm.get(str1[i]);
				   if((str1.length-1)==i)
					   next=0;
				   else
					   next=tm.get(str1[i+1]);
				   if(current>=next)
					   count+=current+next;
				   else
					   count+=next-current;
				   System.out.println(count);
			   }
			   
		   }
	}

}
