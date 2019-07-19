package com.neuedu.chapter02;

public class TestGenericDemo {

	/*
	 *  ������ĺô��� 1. �����������ط���������
	 *             2. ���ڼ�������˵�������޶����뼯���е��������ͣ�����ȡ��Ԫ�ص�ʱ�򣬲���Ҫǿ������ת��
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
