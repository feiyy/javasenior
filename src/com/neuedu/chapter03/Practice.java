package com.neuedu.chapter03;

import java.io.File;

public class Practice {
	
	public static void main(String[] args) {
		
		//����һ��Ŀ¼���ݹ�ı���Ŀ¼�µ������ļ����г��ļ���
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
