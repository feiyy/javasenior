package com.neuedu.chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream {

	public static void main(String[] args) {
		//hahaha
		//bbbbbb
		//cccccc
		try {
			InputStream in = new FileInputStream("d:/io/b.txt");
			/*int c = in.read();
			while(c!=-1)
			{
				System.out.print((char)c);
				c = in.read();
			}*/
			
			byte[] b = new byte[30];
			in.read(b);
			for(byte item :b)
			{
				System.out.println(item);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
