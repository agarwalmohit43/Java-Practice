package com.mohit.geeks;

import javax.lang.model.type.IntersectionType;

public class unionandintersection {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,6,7};
		int[] b={2,3,4,9};
		union(a,b,a.length,b.length);
		intersection(a,b);
		
	}

	private static void intersection(int[] a, int[] b) {

		System.out.println();
		int i=0,j=0;
		while(i<a.length && j<b.length){

			if(a[i]< b[j])
			{
				i++;
			}else if(a[i]>b[j]){
				j++;
			}else{
				System.out.print(" "+b[j++]);
				i++;
			}
		}
	}

	private static void union(int[] a, int[] b, int length, int length2) {

		int i=0,j=0;
		
		while(i<length && j<length2)
		{
						if(a[i]< b[j])
						{
							System.out.print(" "+a[i++]);
						}else if(a[i]>b[j]){
							System.out.print(" "+b[j++]);
						}else{
							System.out.print(" "+b[j++]);
							i++;
						}
						
	    }
		
		while(i<length){
			System.out.print(" "+a[i++]);
		}
		while(j<length2){
			System.out.print(" "+b[j++]);
		}
		

		
	}

}
