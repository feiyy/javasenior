package com.neuedu.chapter01;

import java.util.Calendar;

public class Practice_01 {
	
	public static boolean getNum(String str){
		// �Ƿ����1��2��3��4��5
		int arr[] = {1,2,3,4,5};
		for(int num : arr){
			if(str.indexOf(num+"") == -1){
				return false;
			}
		}
		// �ж��Ƿ�������2
		if(str.indexOf("2") == str.lastIndexOf("2")){
			return false;
		}
		// 4���ڵ���λ
		if(str.charAt(2) == '4'){
			return false;
		}
		// 3��5�������� 
		if(str.indexOf("35") != -1 || str.indexOf("53") != -1){
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * 1��2��2��3��4��5
		 * �ڿ���̨��ӡ��6������ɵ��������
		 * �� 4���ڵ���λ
		 * �� 3��5�������� 
		 * 
		 * 
		 * String str = "sgfdfgfgjhfasdasdasd";
		 * �ڿ���̨��ӡ ����ַ��� ���ֹ���Щ�ַ������ֹ�����
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
		
		// ��һ�����л������������ͷ�����һ������12321����һ����������
		// ��дһ�����򣬴������еõ�һ���������жϸ����ǲ��ǻ�����
//		StringBuffer sbf = new StringBuffer("1234321");
//		if(sbf.toString().equals(sbf.reverse().toString())){
//			System.out.println("�ǻ�����");
//		}
	}

}
