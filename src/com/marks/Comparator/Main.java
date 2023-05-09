package com.marks.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) 
	{
		Student s1 =new Student("yogesh",new Marks(106,70,67,76));
		Student s2 =new Student("abhiranjan",new Marks(102,95,77,70));
		Student s3 =new Student("Ankesh",new Marks(105,91,93,80));

		List<Student> stud = new ArrayList<>();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		
		System.out.println("Unsorted :");
		for (Student student : stud) 
		{
			System.out.println(student);
		}
        
		System.out.println("===========================");
		Collections.sort(stud,new SortByRegNo());
		
		System.out.println("Sorted by regNo :");
		for (Student student : stud) 
		{
			System.out.println(student);
		}
		System.out.println("=======================");
		
		Collections.sort(stud, new SortByMaths());
		System.out.println("Sorted by highest marks in maths :");
		
		for (Student student : stud) 
		{
			System.out.println(student);
		}
		
		System.out.println("===========================");
		System.out.println("Sorted by obtained percentage :");
		
		Collections.sort(stud, new SortByPercentage());
		for (Student student : stud) 
		{
			System.out.println(student);
		}
		
		System.out.println("=============================");
		System.out.println("sorted by Rank  :");
		
		for (Student student : stud) 
		{
			System.out.println(student);
		}
		
		System.out.println("=================================");
		System.out.println("Sorted by Toal marks in Maths and Science Alone :");
		
		for (Student student : stud) 
		{
			System.out.println(student);
		}
	}	
}
