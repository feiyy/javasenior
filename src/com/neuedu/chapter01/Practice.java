package com.neuedu.chapter01;

public class Practice {
	
	//1. 三位数数字转化字符串补零，如：数字1转化后为“001”
	//2. 计算字符串的长度，但是不可以调用字符串的length属性。
	//3. 控制台输入一个邮箱地址，校验合法性，
	   //3.1 规则： 必须有@，必须有.
	   //3.2: @不能是第一个，.不能是最后一个
	   //3.3  @必须在.前面
	   //3.4 内容只能是字母，数字，下划线
	public static void main(String[] args) {
		String email = "中feiyy@neusoft.com.cn";
		System.out.println(email.matches("^[a-zA-Z0-9_]+@\\w+(\\.[a-zA-Z]+){1,2}$"));
	}
	
	

}
