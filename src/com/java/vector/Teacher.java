package com.java.vector;

public class Teacher {
	String name;
	String subject;
	int age;
	public Teacher(String name, String subject, int age) {
		super();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + ", age=" + age + "]";
	}
}
