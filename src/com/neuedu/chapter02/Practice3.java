package com.neuedu.chapter02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		//单词之间使用空白字符分割
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\s+");
		List<ReString> list = new ArrayList<>();
		for(String item :arr)
		{
			ReString rstr = new ReString();
			rstr.setStr(item);
			//add into list
			list.add(rstr);
		}
		//sort
		Collections.sort(list);
		//print list
		for(ReString item:list)
		{
			System.out.println(item.getStr());
		}
	}

}

class ReString implements Comparable<ReString>{
	
	private String str;
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public int compareTo(ReString o) {
		// TODO Auto-generated method stub
		return this.str.toLowerCase().compareTo(o.getStr().toLowerCase());
	}
	
}
