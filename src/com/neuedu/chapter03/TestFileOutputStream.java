package com.neuedu.chapter03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileOutputStream {

	public static void main(String[] args) {
		
		try {
			//true means append rather than rewrite
			OutputStream out = new FileOutputStream("d:/io/c.txt",true);
			
			/*out.write(98);*/
			String str ="ÎÒ°®ÄãÖÐ¹úabc";
			byte[] b = str.getBytes("utf-8");
			
			out.write(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
