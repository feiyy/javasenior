package com.neuedu.chapter03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class TestObjectInputStream {

	public static void main(String[] args) {
		
		try {
			InputStream in = new FileInputStream("d:/io/students.data");
			
			ObjectInputStream ois = new ObjectInputStream(in);
			
			List<Student> list = (List<Student>)ois.readObject();
			
			for(Student s: list)
			{
				System.out.println(s.getId()+"\t"+s.getName());
			}
			
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
