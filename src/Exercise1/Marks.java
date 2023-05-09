package Exercise1;

public class Marks {


	private int regNo;
	private double MarksInEnglish;
	private double MarksInMaths;
	private double MarksInScience;

	public Marks(int regNo, double marksInEnglish, double marksInMaths, double marksInScience) {
		super();
		this.regNo = regNo;
		this.MarksInEnglish = marksInEnglish;
		this.MarksInMaths = marksInMaths;
		this.MarksInScience = marksInScience;
	}
	
	@Override
	public String toString() {
		return "Marks [regNo=" + regNo + ", MarksInEnglish=" + MarksInEnglish + ", MarksInMaths=" + MarksInMaths
				+ ", MarksInScience=" + MarksInScience + "]";
	}



	public int getRegNo() {
		return regNo;
	}



	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}



	public double getMarksInEnglish() {
		return MarksInEnglish;
	}



	public void setMarksInEnglish(double marksInEnglish) {
		MarksInEnglish = marksInEnglish;
	}



	public double getMarksInMaths() {
		return MarksInMaths;
	}



	public void setMarksInMaths(double marksInMaths) {
		MarksInMaths = marksInMaths;
	}



	public double getMarksInScience() {
		return MarksInScience;
	}



	public void setMarksInScience(double marksInScience) {
		MarksInScience = marksInScience;
	}



	public void display()
	{
		System.out.println("the register number is :"+this.regNo);
		System.out.println("the mark in English:"+this.MarksInEnglish);
		System.out.println("the mark in Maths:"+this.MarksInMaths);
		System.out.println("the mark in :"+this.MarksInScience);
	}





}