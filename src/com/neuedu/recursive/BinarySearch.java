package com.neuedu.recursive;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,8,10,12,14};
		
		System.out.println(search(arr,3,0,arr.length-1));
		
	}
	
	public static int search(int[] arr, int data, int startIndex, int endIndex)
	{
		int middleIndex = (startIndex + endIndex)/2;
		if(data<arr[startIndex] || data>arr[endIndex] || startIndex>endIndex)
		{
			return -1;
		}
		
		if(data<arr[middleIndex])
		{
			return search(arr, data, startIndex, middleIndex-1);
		}
		else if(data>arr[middleIndex])
		{
			return search(arr, data, middleIndex+1, endIndex);
		}
		else
		{
			return middleIndex;
		}
	}

}
