package com.neuedu.chapter02;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1 = {60,90,77,88};
		bubbleSort(arr1);
		for(Integer item: arr1)
		{
			System.out.println(item);
		}
		
		String[] arr2 = {"tom","emmy","allen"};
		bubbleSort(arr2);
		for(String item: arr2)
		{
			System.out.println(item);
		}
		
		Student s1 = new Student();
		s1.setName("tom");
		s1.setAge(18);
		s1.setScore(88);
		
		Student s2 = new Student();
		s2.setName("jerry");
		s2.setAge(25);
		s2.setScore(66);
		
		Student s3 = new Student();
		s3.setName("maryy");
		s3.setAge(25);
		s3.setScore(90);
		
		Student[] arr3 = new Student[3];
		arr3[0] = s1;
		arr3[1] = s2;
		arr3[2] = s3;
		
		bubbleSort(arr3);
		for(Student item : arr3)
		{
			System.out.println(item.getName()+"\t"+item.getScore());
		}
		

	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		T temp = null;
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-i-1;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
				{
					//swith places
					temp = arr[j];
					arr[j] = arr[j+1];					
					arr[j+1] = temp;					
				}
			}
		}
	}

}
