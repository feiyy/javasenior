package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// 数组 ： 能保存一组数据，只能保存一种数据类型，定长
		// 集合 ： 能保存一组数据，可以保存任意数据类型 -- 只保存引用数据类型，自动扩容
		// Collection 线性集合（单列集合）
   		//		List 	有序有重复  -- 
		// 			① ArrayList  --  基于Array实现，随机访问速度快
		// 			② LinkedList --	基于链表实现，插入删除速度快
		//		Set		无序无重复
		//			① HashSet
		// Map 非线性（双列集合）
		
		// 泛型 ： 类型参数化
		
//		List<String> list = new ArrayList();
//		list.add("hello1");
//		list.add("hello2");
//		
//		LinkedList<String> list1 = new LinkedList<>();
		
//		list.add("hello2");
//		list.add(true);
//		list.add(1);
//		
//		System.out.println(list.get(2));
		
//		for(int i = 0;i < list.size();i++){
//			System.out.println(list.get(i));
//		}
		
//		for(String obj : list){
//			System.out.println(obj);
//		}
		
//		List<Student> list = new ArrayList<>();
//		list.add(new Student(12, "zs1"));
//		list.add(new Student(13, "zs2"));
//		list.add(new Student(14, "zs3"));
//		list.add(new Student(15, "zs4"));
//		
//		for(Student stu : list){
//			System.out.println(stu.getName());
//		}
		
//		Set<String> set = new HashSet<>();
//		set.add("hello1");
//		set.add("hello3");
//		set.add("hello2");
//		System.out.println(set);
//		
//		for(String str : set){
//			System.out.println(str);
//		}
	}

}
