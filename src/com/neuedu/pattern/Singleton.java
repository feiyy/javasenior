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
		//懒汉式（多个线程并发的时候，需要加锁）
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
