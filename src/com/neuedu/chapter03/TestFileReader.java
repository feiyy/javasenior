package com.neuedu.chapter03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestFileReader {

	public static void main(String[] args) {
		
		try {
			Reader r = new FileReader("d:/io/b.txt");
			
			int num = r.read();
			while(num !=-1)
			{
				System.out.print((char)num);
				num = r.read();
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
