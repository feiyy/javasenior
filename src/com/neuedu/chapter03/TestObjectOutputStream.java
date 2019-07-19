package com.neuedu.chapter03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TestObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException {
		
		Student s = new Student();
		s.setId(1);
		s.setName("jack");
		
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("tom");
		
		List<Student> list = new ArrayList<>();
		list.add(s);
		list.add(s2);
		
		OutputStream out = new FileOutputStream("d:/io/students.data");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			//write student instance to file
			oos.writeObject(list);
	
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
