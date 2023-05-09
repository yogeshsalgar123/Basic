package DemoComparator;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassStudent {

	public static void main(String[] args) {
		// Creating an empty ArrayList of Student type
		ArrayList<Student> als= new ArrayList<Student>();
		
		 // Adding entries in above List
        // using add() method
		als.add(new Student(109, "Abhi", "Banglore"));
		als.add(new Student(104, "Ankesh", "Pune"));
		als.add(new Student(101, "Snehal", "Mumbai"));
		als.add(new Student(107, "ram", "delhi"));
		
		
		
		 // Display message on console for better readability
		System.out.println("Unsorted  : ");
		
		
		for (Student student : als) 
		{
			System.out.println(student);
		}
		
		// Sorting student entries by roll number
		Collections.sort(als, new SortByRollno());
		
		
		System.out.println("========================");
		
		System.out.println("Sorted By Roll No : ");
		
		for (Student student : als) 
		{
			System.out.println(student);
		}	
		
		Collections.sort(als,new SortByName());
		
		System.out.println("================");
		System.out.println("Sorted BY Name :");
		
		for (Student student : als) 
		{
			System.out.println(student);
		}

	}

}
