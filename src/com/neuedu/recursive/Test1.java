package com.neuedu.recursive;

public class Test1 {

	public static void main(String[] args) {
		
		//print(100);
		System.out.println(sum(5));

	}
	
	public static void print(int n)
	{
		System.out.println(n);
		if(n==1)
		{
			return;
		}
		print(n-1);
	}
	
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		return n + sum(n-1);
	}
	
	public static int Fibonacci(int index)
	{
		if(index==1)
		{
			return 0;
		}
		if(index == 2)
		{
			return 1;
		}
		return Fibonacci(index-1) + Fibonacci(index-2);
	}

}
