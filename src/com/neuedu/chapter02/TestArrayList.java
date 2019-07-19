package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		//ArrayList和LinkedList的区别
		   //ArrayList内部实现是数组，线性的，内存地址是连续的。随机访问速度快。插入删除慢
		   //LinkedList 内部实现是链表，内存地址不连续，随机访问速度慢，插入删除快
		
		//LinkedList 对头元素和尾元素提供了操作的api,从来实现队列（先进先出）和堆栈（后进先出）	
		
		List<String> list = new ArrayList<>();
		list.add("tom");
		list.add("jerry");
		list.add("marry");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String name = it.next();			
			System.out.println(name);
		}
		
        //list 遍历有3种方式
		for(int i=0; i<list.size();i++)
		{
			String name = list.get(i);
		}
		
		//for-each
		for(String item: list)
		{
			System.out.println(item);
		}
	}

}
