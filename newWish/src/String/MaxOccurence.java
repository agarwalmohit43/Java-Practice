package String;

public class MaxOccurence {

	static String string="abbbbbbbbcddggaaybbbby";
	static String[] arr=string.split("");
	
	static String maxOccured="";
	static int count;
	public static void main(String[] args) {

		
		removeRepeated();
		System.out.println("Maximum occured: "+maxOccured+" times: "+count);
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
					flag++;
					j++;
				}else{
					j++;
				}
			}
			if(flag>count){
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
