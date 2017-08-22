package com.mohit.geeks;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    public static BigInteger process(int[][] arr) {
        return recursivecall(arr, new int[arr.length], 0);
    }

    public static BigInteger recursivecall(int[][] arr, int[] selection, int currentRow) {
        if(currentRow >= arr.length) {
            System.out.println(Arrays.toString(selection));
            return BigInteger.ONE;
        }
        BigInteger count = BigInteger.ZERO;
        for (int c : arr[currentRow]) {
            selection[currentRow] = c;
            count = count.add(recursivecall(arr, selection, currentRow + 1));
        }
        return count;
    }

    public static void main(String[] args) {
int row,col;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter No. Of rows: ");
		row=in.nextInt();
		System.out.println("Enter No. Of columns: ");
		col=in.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Input Section");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				
				System.out.println("Enter the values for "+(i+1)+" row and "+(j+1)+" column");
				arr[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Values");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		process(arr);
    }
}
