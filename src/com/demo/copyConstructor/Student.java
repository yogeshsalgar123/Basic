package com.demo.copyConstructor;

public class Student {
	private  int id;
	private  String name;
	

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(Student stud) {
		this.id=stud.id;
		this.name=stud.name;
	}

	public  void display() {
		System.out.println("id :"+id +"  name:"+name);
	}

	public static void main(String[] args) {
		Student student1 = new Student(1, "Sham");

		Student student2 = new Student(student1);

		student1.display();
		student2.display();
	}

}
