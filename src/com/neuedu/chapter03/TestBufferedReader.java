package com.neuedu.chapter03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestBufferedReader {
	
	public static void main(String[] args) {
		
		try(Reader r = new FileReader("d:/io/b.txt");
			BufferedReader br = new BufferedReader(r);) {

			String line;
			while((line = br.readLine()) !=null)
			{
				System.out.println(line);			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
