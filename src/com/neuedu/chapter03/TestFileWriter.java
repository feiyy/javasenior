package com.neuedu.chapter03;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestFileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Writer w = new FileWriter("d:/io/c.txt",true)) {
			
			//true means to keep file content, and append new content
			
			w.write("Œ“∞Æƒ„ ¿ΩÁ");
			
			w.write(97);
			
			//w.flush();
			
			//w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
