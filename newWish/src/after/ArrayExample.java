package after;

public class ArrayExample {
	static int[] arr=new int[15];
	
	public static void main(String[] args) {
		initialise();
		display();
		insertAtPos(15,1);
		display();
		deleteAtPos(8);
		display();
	}
	
	private static void deleteAtPos(int pos) 
	{
		for(int i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
	}
	
	
	private static void display() {

		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	private static void initialise() {
		for(int i=0;i<10;i++){
			arr[i]=i+1;
		}
	}
	
	private static void insertAtPos(int value, int pos) {

		for(int i=arr.length-1;i>=pos;i--){
			arr[i]=arr[i-1];
		}
		arr[pos-1]=value;
	}

}
