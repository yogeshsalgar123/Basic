package com.collection.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee implements Comparable<Employee>{
	private int eid;
	private String  eName;
	private long enumber;
	
	
	//to print object data directly in collection we need to override to String method 
	
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", eid=" + eid + ", enumber=" + enumber + "]";
	}


	@Override
	public int compareTo(Employee emp) {
		if (eid == emp.getEid()) {
			return 0;
		} else if (eid>emp.getEid()) 
		         {
			       return 1;
		              }
		        else {
			          return -1;
		              }            
	     }
		
}
