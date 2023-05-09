package WorkarWage;

public class Worker implements Comparable<Worker>{
	String name;
	int salary;
	int PayPerWeek;
	
	
	
	public Worker(String name, int salary, int payPerWeek) {
		super();
		this.name = name;
		this.salary = salary;
		PayPerWeek = payPerWeek;
	}



	public void pay()
	{
		
	}

	@Override
	public int compareTo(Worker w) {
		
		return 0;
	}
}
