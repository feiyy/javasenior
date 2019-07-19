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
			//����������
			while(arr[j]>=base && i<j)
			{
				j--;
			}
			//����������
			while(arr[i]<=base && i<j)
			{
				i++;
			}
			
			//i �� j ����
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}		
		}
		
		//base��i��λ�ý���
		arr[left] = arr[i];
		arr[i] = base;
		
		sort(arr, left, i-1);
		sort(arr, i+1, right);
	}

}
