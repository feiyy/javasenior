package com.neuedu.chapter01;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] ->String
		char[] arr = {'a','b','��'};
		String str = new String(arr);
		//System.out.println(str);//ab��
		
		//String -> char[]
        String str2 = "�������";
        char[] arr2 = str2.toCharArray();
        /*for(char c:arr2)
        {
        	System.out.print(c);
        }*/
        
        //string -> byte[]
        //�쳣��������쳣���Ǽ�����쳣(sc.nextInt())
        Scanner sc = new Scanner(System.in);       
        
        String a = "a��b��c";
        byte[] b;
					
		b = a.getBytes(StandardCharsets.UTF_8);
		for(byte item: b)
        {
        	System.out.println(item);
        }
		
		//byte[] ->String
		String newstr;
		try {
			newstr = new String(b,"utf-8");//?
			System.out.println(newstr);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
