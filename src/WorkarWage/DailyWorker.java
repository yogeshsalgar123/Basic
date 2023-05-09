package WorkarWage;

public class DailyWorker extends Worker
{
	int workingDays;
	int payPerHrs=90;

	
	
	public DailyWorker(String name, int salary, int payPerWeek) {
		super(name, salary, payPerWeek);
		this.workingDays = workingDays;
		this.payPerHrs = payPerHrs;
	}



	@Override
	public void pay()
	{
		int payPerDay= payPerHrs*8;  //per day payment
		this.PayPerWeek =workingDays*payPerDay; 
	}



	@Override
	public String toString() {
		return "DailyWorker [workingDays=" + workingDays + ", payPerHrs=" + payPerHrs + "]";
	}
	
	
	
}
