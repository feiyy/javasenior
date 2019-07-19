package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		list.forEach(System.out::println);
		
		List<String> list2 = new ArrayList<>(Arrays.asList("apple","grape","banana","pear"));
		
		String maxstr = Collections.max(list2);
		String minstr = Collections.min(list2);
		
		System.out.println(maxstr);
		System.out.println(minstr);
		
		Collections.sort(list2);
		list2.forEach(System.out::println);
		
	}

}
