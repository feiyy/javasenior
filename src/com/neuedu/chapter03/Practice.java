package com.neuedu.chapter03;

import java.io.File;

public class Practice {
	
	public static void main(String[] args) {
		
		//给定一个目录，递归的遍历目录下的所有文件，列出文件名
		File f = new File("d:/io");
		listFiles(f);
		
	}
	
	public static void listFiles(File f)
	{
		if(f.isDirectory())
		{
			File[] items = f.listFiles();
			for(File item : items)
			{
				listFiles(item);
			}
		}
		else
		{
			System.out.println(f.getName());
		}
	}

}
