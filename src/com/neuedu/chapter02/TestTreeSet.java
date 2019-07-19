package com.neuedu.chapter02;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//红球6个1-33， 篮球1个 1-16
		Set<Integer> redballs = new TreeSet<>();
		
		Random r = new Random();
		
		while(redballs.size()<6)
		{
			//1. 生成1-33的随机数
			int num = r.nextInt(33)+1;
			//2. 放set
			redballs.add(num); //自动排序，一边放一边排序
		}
		
	    //生成篮球
		int blueball = r.nextInt(16)+1;
		
		//打印红球
		//set怎么遍历 Iterator, for-each, 特别注意，set没有下标，不能用i
		Iterator<Integer> it = redballs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//print blue balls
		System.out.println(blueball);

	}

}
