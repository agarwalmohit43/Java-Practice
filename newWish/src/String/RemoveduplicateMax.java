package String;

import java.util.Arrays;

public class RemoveduplicateMax {

	static String string="aaaaaaaaabbbbbbbbcddggaaybbbby";
	static String[] arr=string.split("");
	
	static String maxOccured="";
	static int count;
	public static void main(String[] args) {

		
		removeRepeated();
		//display();
		
		System.out.println("New String: "+newString());
		System.out.println("Maximum occured: "+maxOccured+" times: "+count);
	}

	private static StringBuilder newString() {

		StringBuilder string=new StringBuilder();
		for(String elements:arr){
			string.append(elements);
		}
		
		return string;
	}

	private static void display() {

		for(String elements:arr){
			System.out.print(elements+" ");
		}
		System.out.println();
	}

	private static void removeRepeated() {

		
		for(int i=0;i<arr.length-1;i++){
			int flag=0;
			int j=i+1;
			while(j<arr.length){
				if(arr[j].equals("")){
					break;
				}else if(arr[i].equals(arr[j])){
					removeElment(j+1);
					flag++;
				}else{
					j++;
				}
			}
			if(flag+1>count){
				count=flag+1;
				maxOccured=arr[i];
			}
			
		}
		
	}

	private static void removeElment(int pos) {

		for(int i=pos-1;i<arr.length-1;i++){
			arr[i]=arr[i+1];
			arr[i+1]="";
		}
	}
}
