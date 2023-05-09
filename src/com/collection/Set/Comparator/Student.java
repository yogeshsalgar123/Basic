package com.collection.Set.Comparator;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Comparator<Student>{
    
	private int id;
	private String name;
	private long number;


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", number=" + number + "]";
	}


	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.id-s2.id;
	}
	
	


}
