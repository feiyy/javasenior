package com.neuedu.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		/*Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s);*/
		
		try {
			InputStream out = new FileInputStream("d:/io/s.data");
			ObjectInputStream oos = new ObjectInputStream(out);
			Singleton s = (Singleton)oos.readObject();
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
