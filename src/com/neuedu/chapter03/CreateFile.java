package com.neuedu.chapter03;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		
		File f = new File("c:/users/Administrator/.m2");
		
		f.mkdir();

	}

}
