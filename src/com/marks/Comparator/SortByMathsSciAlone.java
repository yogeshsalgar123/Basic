package com.marks.Comparator;

import java.util.Comparator;

public class SortByMathsSciAlone implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.getMarks().totalMathAndScience()-s2.getMarks().totalMathAndScience();
	}
	
}
