package String;

import java.util.ArrayList;

public class missingwords {

	public static void main(String[] args) {

		String a="I am using hackerrank to improve programming";
		String b="hackerrank am to improve";
		
		String missingWords="";
		missingWordsFind(a,b);
	}

	private static void missingWordsFind(String a, String b) {

		String[] c=a.split(" ");
		String[] d=b.split(" ");
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<c.length;i++){
			int flag = 0;
			for(int j=0;j<d.length;j++){
				
				if(c[i].equals(d[j])){
					flag=0;
					break;
				}					
				else
					flag++;
			}
			if(flag>=1){
				al.add(c[i]);
				
			}
				
			}
		System.out.println(al);
		}
		
	}

