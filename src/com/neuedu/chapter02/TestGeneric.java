package com.neuedu.chapter02;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Demo d = new Demo();
		d.fun(10);*/
		String[] arr = fun1("1","2","3","4");
		System.out.println(arr.length);
	}
	
	public static <T> T[] fun1(T...arg)
	{
		return arg;
	}
	
	public static <T> void fun2(T[] arr)
	{
		for(T item :arr)
		{
			System.out.println(item);
		}
	}
}


