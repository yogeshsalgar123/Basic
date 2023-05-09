package com.marks.Comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Marks {
	private int regNo;
	private int marksInEng;
	private int marksInMaths;
	private int marksInScience;
	
	
	public int per()
	{
		return ((this.marksInEng+this.marksInMaths+this.marksInScience)/300)*100;
	}
	
	public int totalMathAndScience()
	{
		return this.marksInMaths+this.marksInScience;	
	}
	

}
