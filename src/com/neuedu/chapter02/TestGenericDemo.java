package com.neuedu.chapter02;

public class TestGenericDemo {

	/*
	 *  泛型类的好处： 1. 减少类中重载方法的数量
	 *             2. 对于集合类来说，可以限定放入集合中的数据类型，并且取出元素的时候，不需要强制类型转换
	 * 
	 * */
	
	public static void main(String[] args) {
		
		//new Info instance
		Info<String, Integer> info = new Info<>("tom",20);
		
		Demo<Info<String, Integer>> demo = new Demo<>(info);

	}

}

class Info<K,V>
{
	private K k;
	private V v;
	
	public Info(K k, V v)
	{
		this.k = k;
		this.v = v;
	}
}

class Demo<T>
{
	private T t;
	
	public Demo(T t)
	{
		this.t= t;
	}
}
