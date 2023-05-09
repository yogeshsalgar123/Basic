package WorkarWage;

public class SalariedWorker extends Worker{
	
	int payPerHrs = 200;


	public SalariedWorker(String name, int salary, int payPerWeek) {
		super(name, salary, payPerWeek);
		this.payPerHrs = payPerHrs;
	}




	@Override
	public void pay()
	{
		this.PayPerWeek=this.payPerHrs*40;
	}




	@Override
	public String toString() {
		return "SalariedWorker [payPerHrs=" + payPerHrs + "]";
	}

	
	
	
	
}
