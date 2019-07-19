package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	
	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1.add(50);
		list1.add(80);
		list1.add(60);
		list1.add(70);
		
		//sort in ascending order
		//Collections排序的对象必须实现一个接口
		Collections.sort(list1); //50,60,70,80
		
		//通过二分查找，找到80所在的位置
		System.out.println(Collections.binarySearch(list1, 80));//3
		
		Collections.reverse(list1);
		
		for(Integer item : list1)
		{
			System.out.println(item);
		}
		
		List<String> list2 = new ArrayList<>();
		list2.add("tom");
		list2.add("jerry");
		list2.add("marry");
		
		Collections.sort(list2);
		Collections.reverse(list2);
		
		for(String item : list2)
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
		
		List<Student> list3 = new ArrayList<>();
		list3.add(s1);
		list3.add(s2);
		list3.add(s3);
		
		Collections.sort(list3);
		
		for(Student s: list3)
		{
			System.out.println(s.getName()+"\t"+s.getScore());
		}
	}

}
