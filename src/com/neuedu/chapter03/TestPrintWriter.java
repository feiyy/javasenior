package com.neuedu.chapter03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class TestPrintWriter {

	public static void main(String[] args) {
		
		try(Writer w = new FileWriter("d:/io/c.txt",true);
				
			PrintWriter pw = new PrintWriter(w);) {
			
			pw.println("一行");
			pw.println("两行");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
