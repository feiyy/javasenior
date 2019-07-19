package com.neuedu.chapter01;

import java.util.Calendar;

public class Practice_01 {
	
	public static boolean getNum(String str){
		// 是否包含1，2，3，4，5
		int arr[] = {1,2,3,4,5};
		for(int num : arr){
			if(str.indexOf(num+"") == -1){
				return false;
			}
		}
		// 判断是否是两个2
		if(str.indexOf("2") == str.lastIndexOf("2")){
			return false;
		}
		// 4不在第三位
		if(str.charAt(2) == '4'){
			return false;
		}
		// 3、5不能相连 
		if(str.indexOf("35") != -1 || str.indexOf("53") != -1){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * 1，2，2，3，4，5
		 * 在控制台打印这6个数组成的所有组合
		 * ① 4不在第三位
		 * ② 3、5不能相连 
		 * 
		 * 
		 * String str = "sgfdfgfgjhfasdasdasd";
		 * 在控制台打印 这个字符串 出现过哪些字符，出现过几次
		 */
//		for(int i = 122345;i <= 543221;i++){
//			if(getNum(i+"")){
//				System.out.println(i);
//			}
//		}
		
		
//		Calendar c = Calendar.getInstance();
//		c.set(2019, 6, 10, 13, 47, 22);
//		c.add(Calendar.HOUR, -7);
//		System.out.println(c.getTime());
		
		// 有一种数叫回文数，正读和反读都一样，如12321便是一个回文数。
		// 编写一个程序，从命令行得到一个整数，判断该数是不是回文数
//		StringBuffer sbf = new StringBuffer("1234321");
//		if(sbf.toString().equals(sbf.reverse().toString())){
//			System.out.println("是回文数");
//		}
	}

}
