package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		//ArrayList��LinkedList������
		   //ArrayList�ڲ�ʵ�������飬���Եģ��ڴ��ַ�������ġ���������ٶȿ졣����ɾ����
		   //LinkedList �ڲ�ʵ���������ڴ��ַ����������������ٶ���������ɾ����
		
		//LinkedList ��ͷԪ�غ�βԪ���ṩ�˲�����api,����ʵ�ֶ��У��Ƚ��ȳ����Ͷ�ջ������ȳ���	
		
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
		
        //list ������3�ַ�ʽ
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
