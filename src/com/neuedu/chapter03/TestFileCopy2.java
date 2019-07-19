package com.neuedu.chapter03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class TestFileCopy2 {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		
		try(InputStream in = new FileInputStream("e:/Springboot.exe");
			InputStream bin = new BufferedInputStream(in);
			OutputStream out = new FileOutputStream("d:/Springboot.exe");
			OutputStream bout = new BufferedOutputStream(out);) {

			byte[] b= new byte[1024];
			
			int len = bin.read(b);
			while(len!=-1)
			{
				bout.write(b, 0, len);
				//bout.flush();
				len = bin.read(b);	
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date d2 = new Date();
		
		System.out.println(d2.getTime() - d1.getTime());

	}

}
