package String;

import java.awt.DisplayMode;

public class RemoveRepeat {

	static String string="abbbbbbdasdbbcddasddggaayy";
	static String[] arr=string.split("");
	public static void main(String[] args) {

		
		removeRepeated();

		System.out.println("New String: "+newString());
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
			int j=i+1;
			while(j<arr.length){
				if(arr[j].equals("")){
					break;
				}else if(arr[i].equals(arr[j])){
					removeElment(j+1);
				}else{
					j++;
				}
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
