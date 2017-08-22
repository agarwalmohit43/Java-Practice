package check;

public class BinarySearch {

	static int[] arr={1,2,3,4,5,6,7,8};
	public static void main(String[] args) {
		int n = arr.length;
        int x = 10;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at position "+(result+1));
		
	}
	static int binarySearch(int arr[], int l, int r, int x)
	    {
		if (r>=l)
        {
            int mid = l + (r - l)/2;
            if (arr[mid] == x)
               return mid;
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
            else
            	return binarySearch(arr, mid+1, r, x);
        }
        return -1;
	    }
	
	int binarySearchItterative(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was not present
        return -1;
    }
	

}
