package com.neuedu.chapter01;

public class Practice {
	
	//1. ��λ������ת���ַ������㣬�磺����1ת����Ϊ��001��
	//2. �����ַ����ĳ��ȣ����ǲ����Ե����ַ�����length���ԡ�
	//3. ����̨����һ�������ַ��У��Ϸ��ԣ�
	   //3.1 ���� ������@��������.
	   //3.2: @�����ǵ�һ����.���������һ��
	   //3.3  @������.ǰ��
	   //3.4 ����ֻ������ĸ�����֣��»���
	public static void main(String[] args) {
		String email = "��feiyy@neusoft.com.cn";
		System.out.println(email.matches("^[a-zA-Z0-9_]+@\\w+(\\.[a-zA-Z]+){1,2}$"));
	}
	
	

}
