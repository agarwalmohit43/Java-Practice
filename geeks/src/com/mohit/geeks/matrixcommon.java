package com.mohit.geeks;

import java.math.BigInteger;
import java.util.ArrayList;

interface moh{}
class mj{
	
}

public class matrixcommon extends mj {

	public static void main(String[] args) {
		
		int mat[][] = {{1, 2, 1, 4, 8},
	             {3, 7, 8, 5, 1},
	             {8, 7, 7, 3, 1},
	             {8, 1, 2, 7, 9},
	            };
		
		solve(mat,4,5);
	}

	private static void solve(int[][] mat, int row, int col) {
		
			ArrayList<Integer> a=new ArrayList<Integer>();
			ArrayList<Integer> b=new ArrayList<Integer>();
			for(int t=0;t<col;t++){
				a.add(mat[0][t]);
			}
			for(int i=1;i<row;i++){
				for(int j=0;j<col;j++){
					if(a.contains(mat[i][j])){
						b.add(mat[i][j]);
					}
				}
			}
			System.out.println(b);
	}
	
	



}
