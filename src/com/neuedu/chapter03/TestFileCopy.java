package com.neuedu.chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestFileCopy {

	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("e:/es20190705.rar");
			out = new FileOutputStream("d:/es20190705.rar");		
			//
			byte[] buffer = new byte[1024];
			//read
			int len = in.read(buffer);
			while(len!=-1)
			{
				out.write(buffer, 0, len);//ÌØ±ð×¢Òâ
				len = in.read(buffer);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}

}
