package com.mohit.geeks;

import java.io.*;
public class abc 
{ 

    public static void uniqueValue(int input1,int[] input2)
    {
       int[] height = {0,0,0,0};
            for(int i=1;i<=4; i++)
            {

                    for(int j =input2[i-1]; j<input1; j++ )
                        {
                        if(height[j] == 0)
                            height[j] = i;
                        else
                            continue;
                        }
            }
            
            for(int i=0;i<height.length;i++){
        		System.out.println(height);
        	}
    }
    
    public static void main(String[] args){
    	int[] a={2,1,1,0};
    	
    	uniqueValue(4, a);
    	
    	
    }
    
}