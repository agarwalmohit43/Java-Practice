package after;

public class ArrayComparision {

	static int[] arr1 = new int[10];
	static int[] arr2 = new int[3];
	public static void main(String[] args) {
		initialise();
		
		display(arr1);
		display(arr2);
		
		compare(arr1,arr2);
		display(arr1);
	}
	private static void initialise() {
		arr1[0]=2;
		arr1[1]=4;
		arr1[2]=6;
		
		arr2[0]=1;
		arr2[1]=3;
		arr2[2]=5;
	}
	private static void compare(int[] arr1, int[] arr2) {
		
		int i=0,j=0,k=0;
		
		while((i<arr1.length)&&(j<arr2.length))
		{
			if(arr1[i]<arr2[j])
			{
				arr1[k++]=arr1[i++];
			}else
			{
				shiftElements(i+1);
				arr1[k++]=arr2[j++];
				i++;
			}
		}
	}
	private static void shiftElements(int pos) {

		for(int i=arr1.length-1;i>=pos;i--){
			arr1[i]=arr1[i-1];
		}
		
	}
	private static void display(int[] arr) {
		for(int  i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
