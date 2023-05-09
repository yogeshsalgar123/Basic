package com.marks.Comparator;

import java.util.Comparator;

public class SortByRank implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		return s2.getMarks().per()-s1.getMarks().per();
	}	

}
