package com.neuedu.chapter01;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("hello");
		//append
		buffer.append("word");
		System.out.println(buffer);
		
		//���� helloworld
		buffer.insert(2, "a");
		System.out.println(buffer); //healloworld
		
		//�滻
		buffer.setCharAt(2, 'w');
		System.out.println(buffer); //hewlloworld
		
		//ɾ��
		buffer.delete(0, 3);
		System.out.println(buffer);//lloworld
		
		//StringBuilder��StringBuffer������
		  //1. StringBuilder���̲߳���ȫ�ģ�StringBuffer���̰߳�ȫ�ġ�
		  //2. �ڵ��߳��£�StringBuffer�����ܺá�
        StringBuilder builder = new StringBuilder("haha");
        builder.setCharAt(2, 'a');
	}

}
