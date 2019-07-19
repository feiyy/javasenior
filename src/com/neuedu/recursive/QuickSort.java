package com.neuedu.recursive;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,3,2,6,8,10,4,9};
		
		sort(arr, 0, arr.length-1);
		
		for(int item : arr)
		{
			System.out.println(item);
		}

	}
	
	public static void sort(int[] arr, int left, int right)
	{
		if(left > right)
		{
			return;
		}
		
		int base = arr[left];
		int i = left;
		int j = right;
		while(i!=j)
		{
			//从右向左找
			while(arr[j]>=base && i<j)
			{
				j--;
			}
			//从左向右找
			while(arr[i]<=base && i<j)
			{
				i++;
			}
			
			//i 和 j 交换
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}		
		}
		
		//base和i的位置交换
		arr[left] = arr[i];
		arr[i] = base;
		
		sort(arr, left, i-1);
		sort(arr, i+1, right);
	}

}
