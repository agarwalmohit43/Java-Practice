package newWish;
import java.lang.*;
import java.util.Arrays;
import java.io.*;


public class hello {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
		double a= 1.5;
		int b= (int)a;
		System.out.println(a+" "+b);
		
		int arr[]={2,1,3,4,5,6,7,8,9,10};
		//Arrays.sort(arr);
		for(int printArr: arr)
		{
			System.out.println(printArr);
		}
		/*for(;;)
		{
			System.out.println("Infinite loop");
		}*/
		
	}

}
