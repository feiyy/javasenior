package com.neuedu.chapter01;

public class TestString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloworld";
		//indexOf�����жϰ���
		System.out.println(str.indexOf("ll"));//2
		System.out.println(str.indexOf("a")); //-1
		
		System.out.println(str.lastIndexOf("l"));//8
		
		
		//split
		String str2 = "aa.bb.cc.dd";
		//������ʽ�� \d�������� \s����հ��ַ� +����һ�����߶�� \.����. 
		String[] arr = str2.split("\\.");
		for(String item:arr)
		{
			System.out.println(item);
		}
				
		//replace
		String str3 = "helloworld";
		System.out.println(str3.replace("l", "a"));
		

	}

}
