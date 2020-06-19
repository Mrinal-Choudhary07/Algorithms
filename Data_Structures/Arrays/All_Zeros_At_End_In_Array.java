package com.DSA.Data_Structures.Arrays;
public class All_Zeros_At_End_In_Array 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,0,0,0,0,9, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
        int n = arr.length; 
        pushZerosToEnd(arr, n);
	}
	private static void pushZerosToEnd(int[] arr, int n) 
	{
		int count=0;
		for(int i=0 ; i<n ; i++)
		{
			 if( arr[i] != 0 )
				 arr[count++] = arr[i];			 
		}
		while(count < n)
			arr[count++] = 0;
		
		for(int i=0 ; i<n ; i++)		
			System.out.print(arr[i]+" ");
	}
}
