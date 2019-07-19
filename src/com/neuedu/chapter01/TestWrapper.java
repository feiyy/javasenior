package com.neuedu.chapter01;

public class TestWrapper {

	public static void main(String[] args) {
		
		//primitive type -> wrapper 
		int a = 10;
		Integer _a = new Integer(a);
		
		long b = 20;
		Long _b = new Long(b);
		
		char c = 'a';
		Character _c = new Character(c);
		
		//wrapper -> primitive type
		Integer x = new Integer(100);
		int $x = x.intValue();
		
		Long y = new Long(200);
		long $y = y.longValue();
		
		//string->wrapper
		String str = "";
		
		Integer _str = new Integer(str);
		Integer $str = Integer.valueOf(str);
		
		System.out.println(_str);
		System.out.println($str);
		
		
		//wrapper -> string
		Byte bb = 20;
		
		String _bb = bb.toString();
		
		//string -> primitive type
		String str2 = "20";
		
		int _str2 = Integer.parseInt(str2);
		
		long $str2 = Long.parseLong(str2);
		
		//自动装箱
		Integer i = 100; //Integer i = new Integer(100);
		
		Long j = 200L;
		
		//自动装箱
		Integer ii = 100;
		//自动拆箱
		int _ii = ii;
	
	}
	
}
