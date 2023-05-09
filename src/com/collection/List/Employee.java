package com.collection.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {

	private int empid;
	private String ename;
	private long Phoneno;
	
	
	@Override
	public int compareTo(Employee emp) {
		
		return ename.compareTo(emp.getEname());
	}	
}
