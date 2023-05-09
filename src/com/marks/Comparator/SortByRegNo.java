package com.marks.Comparator;

import java.util.Comparator;

public class SortByRegNo implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getMarks().getRegNo()-s2.getMarks().getRegNo();
	}

}
