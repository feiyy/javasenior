package com.neuedu.chapter01;

public class TestWrapper2 {

	public static void main(String[] args) {

	 // -128 -127,���û��new,��Դ�ڳ�����
     Integer a1 = -129;
     Integer a2 = -129;
     System.out.println(a1==a2);//true
     
     Integer b1 = new Integer(10);
     Integer b2 = new Integer(10);
     
     System.out.println(b1==b2);//false
     
     //-128 -127,��Դ�ڳ����أ����������new
     Integer c1 = Integer.valueOf(-127);
     Integer c2 = Integer.valueOf(-127);
     
     System.out.println(c1==c2);
     
    
		 

	}

}
