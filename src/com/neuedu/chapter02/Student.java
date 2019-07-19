package com.neuedu.chapter02;

public class Student implements Comparable<Student>{	
	private int age;
	private String name;
	private double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public Student()
	{
		
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		//比较规则按照score来
		if(this.score == o.score)
		{
			return 0;
		}
		else if(this.score>o.score)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	
}
