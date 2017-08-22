package com.mohit.geeks;
import java.util.*;

public class Matrixa {

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
		int a=(int) Math.pow(col, row);
		
		int arr2[][]=new int[a][row];
		
		
		int i=0,j=0,k=0;
		int q=0,w=0,e=0;
		while(i<a-1){
			
				for(k=0;k<=row;k++){
					
					arr2[i][j]=arr[q][w];
					arr2[i][j+1]=arr[e+1][k];
					
					i++;
				}
				w++;
			
		}
		System.out.println(" Values \n\n");
		for(int m=0;m<a;m++){
			for(int n=0;n<row;n++){
				System.out.print(arr2[m][n]+" , ");
			}
			System.out.println();
		}
		
	}

}
