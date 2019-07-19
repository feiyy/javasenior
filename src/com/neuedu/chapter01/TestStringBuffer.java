package com.neuedu.chapter01;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("hello");
		//append
		buffer.append("word");
		System.out.println(buffer);
		
		//插入 helloworld
		buffer.insert(2, "a");
		System.out.println(buffer); //healloworld
		
		//替换
		buffer.setCharAt(2, 'w');
		System.out.println(buffer); //hewlloworld
		
		//删除
		buffer.delete(0, 3);
		System.out.println(buffer);//lloworld
		
		//StringBuilder和StringBuffer的区别
		  //1. StringBuilder是线程不安全的，StringBuffer是线程安全的。
		  //2. 在单线程下，StringBuffer的性能好。
        StringBuilder builder = new StringBuilder("haha");
        builder.setCharAt(2, 'a');
	}

}
