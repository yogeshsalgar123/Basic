package WorkarWage;

import java.util.Comparator;

public class SortBySalary implements Comparator<Worker> {

	@Override
	public int compare(Worker w1, Worker w2) {
		
		//return w1.salary - w2.salary;
		if(w1.salary>w2.salary)
		{
			return 1;
		}
		else {
			return -1;
		}
	}

}
