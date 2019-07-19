package com.neuedu.chapter01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestObject {
	
	public static void main(String[] args) {
		
		String a = new String("hello");
		String b = new String("hello");
		
		//����String��˵�������new, ����ָ���ַ��������ء�
		String c = "hello";
		String d ="hello";
		
		//System.out.println(a==b);//�Ƚϵ�ַ
		//System.out.println(a.equals(b));//true
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		//System.out.println(o1==o2); //false
		//System.out.println(o1.equals(o2));//false
		
		
		//hashcode
		//���ݶ������ڴ��еĵ�ַ��ʹ�ù�ϣ�㷨��������ġ�ʮ��������
		//˼��һ�����⣺2����ͬ�Ķ��󣬹�ϣ���Ƿ�һ����ͬ��
		   //2����ͬ�Ķ��󣬹�ϣ��һ�����������������ϣ��ͻ��
		   //�����ϣֵ��ͬ������һ����ͬ��
		   //�����ϣֵ��ͬ������һ����ͬ��
		   //������ͬ����ϣ�������ͬ
		System.out.println(Integer.toHexString(o1.hashCode()));
		//System.out.println(o2.hashCode());
		//System.out.println(o1.hashCode());
		//System.out.println(o2.hashCode());
		
		//System.out.println(o1.toString());
		
		
		//create a hashset 
		//Set��List������
		  //1��List���Է��ظ�Ԫ�أ� Set���ܷ��ظ�Ԫ��
		  //2.List����ģ� Set�����򡱣�����key��hashcode, �����set�д洢λ��
		  //<> ��ʯ�������������Ƶ��Ĺ���
		Set<Student> set = new HashSet<>();
		
		Student s = new Student();
		s.setNo(1);
		s.setName("feiyy");
		s.setBirthday("1981-11-23");
		set.add(s);
		
		Student s2 = new Student();
		s2.setNo(2);
		s2.setName("tom");
		s2.setBirthday("1991-1-1");
		set.add(s2);
		
		Student s3 = new Student();
		s3.setNo(1);
		s3.setName("feiyy");
		s3.setBirthday("1981-11-23");
		set.add(s3);
		
		//����println(����)�� ���ȵ��ö����toString()  ��ȫ��@hashcode
		System.out.println(set);		
		//create three student instance
		
	}

}

class Student{	
	private int no;
	private String name;
	private String birthday;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	@Override
	public boolean equals(Object obj) {		
		//����ת��
		if(obj instanceof Student)
		{
			Student s = (Student)obj;
			if(this.no != s.getNo())
			{
				return false;
			}		
			if(!this.name.equals(s.getName()))
			{
				return false;
			}		
			if(!this.birthday.equals(s.getBirthday()))
			{
				return false;
			}		
			return true;
		}
		else
		{
			return false;
		}				
	}
	@Override
	public int hashCode() {
		
		int h = 0;
		h = h*31 + this.name.hashCode();
		h = h*31 + this.birthday.hashCode();
		h = h*31 + this.no;
		
		return h;
	}

}


