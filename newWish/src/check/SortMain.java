package check;

public class SortMain {

	public static void main(String[] args) {

		int arr[] = {12, 11, 13, 5, 6, 7};
		 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
        
        System.out.println("\nSorted array");
        printArray(arr);
	}

	private static void printArray(int[] arr) {

		for(int elements:arr){
			System.out.print(elements+" ");
		}
		System.out.println();
	}

}
