package com.neuedu.chapter02;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	
	private LinkedList<T> list = new LinkedList<>();
	
	public void put(T obj)
	{
		this.list.add(obj);
	}
	
	public T get()
	{
		try
		{
			return list.removeFirst();
		}
		catch(NoSuchElementException e)
		{
			return null;
		}
		
	}

	public static void main(String[] args) {
		
		MyQueue<String> q = new MyQueue<>();
		q.put("p1");
		q.put("p2");
		q.put("p3");
		
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());
		System.out.println(q.get());

	}

}
