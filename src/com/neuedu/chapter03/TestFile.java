package com.neuedu.chapter03;

import java.io.File;
import java.io.IOException;

public class TestFile {
	
	public static void main(String[] args) {
		
		//contructor
		File f = new File("d:/io/a.txt");//路径 /或者\\
		
		//rename
		File ff = new File("d:/io/b.txt");
		f.renameTo(ff);
		
		/*if(!f.exists())
		{		
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
		else
		{
			f.delete();
		}*/
		
		//get file information 
		System.out.println(f.getName());
		System.out.println(f.isDirectory());//false
		System.out.println(f.isFile());//true
		System.out.println(f.getParent());//true
		
		//
		File f2 = new File("d:/io2/io3");
		
		//create folder/directory
		f2.mkdirs();
		
		f.getParentFile();//得到父级文件夹
		
		String[] files = f.list();
		File[] _files = f.listFiles();
	
	}
	
	
	
	

}
