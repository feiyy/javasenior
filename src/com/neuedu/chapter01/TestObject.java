package com.neuedu.chapter01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestObject {
	
	public static void main(String[] args) {
		
		String a = new String("hello");
		String b = new String("hello");
		
		//对于String来说，如果不new, 变量指向字符串常量池。
		String c = "hello";
		String d ="hello";
		
		//System.out.println(a==b);//比较地址
		//System.out.println(a.equals(b));//true
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		//System.out.println(o1==o2); //false
		//System.out.println(o1.equals(o2));//false
		
		
		//hashcode
		//根据对象在内存中的地址，使用哈希算法计算出来的。十进制数。
		//思考一个问题：2个不同的对象，哈希码是否一定不同？
		   //2个不同的对象，哈希码一样，这种情况就做哈希冲突。
		   //如果哈希值不同，对象一定不同。
		   //如果哈希值相同，对象不一定相同。
		   //对象相同，哈希码必须相同
		System.out.println(Integer.toHexString(o1.hashCode()));
		//System.out.println(o2.hashCode());
		//System.out.println(o1.hashCode());
		//System.out.println(o2.hashCode());
		
		//System.out.println(o1.toString());
		
		
		//create a hashset 
		//Set和List的区别
		  //1。List可以放重复元素， Set不能放重复元素
		  //2.List有序的， Set“无序”，根据key的hashcode, 算出来set中存储位置
		  //<> 钻石操作符，类型推导的功能
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
		
		//调用println(对象)， 会先调用对象的toString()  类全名@hashcode
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
		//向下转型
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


