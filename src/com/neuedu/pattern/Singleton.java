package com.neuedu.pattern;

import java.io.Serializable;

public class Singleton implements Serializable{
	
	public static String name = "feiyy";
	private static Singleton instance;
	
	private Singleton()
	{
		
	}
	
	public static synchronized Singleton getInstance()
	{
		//����ʽ������̲߳�����ʱ����Ҫ������
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
