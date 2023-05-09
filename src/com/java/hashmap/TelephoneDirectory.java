package com.java.hashmap;

import java.util.HashMap;

public class TelephoneDirectory {
	public static void main(String[] args)
	{
	  HashMap<String,Long> contacts = new HashMap<String,Long>();

       //insert
	   contacts.put("Yogesh", 9960719512l); 
	   contacts.put("Abhiranjan", 904013027l);
	   contacts.put("Ankesh", 7276124254l);
	   contacts.put(null, 8856980624l);
	   contacts.put("Snehal", 7249178656l);
	   contacts.put("Raksha", 9928372937l);

	   //view all elements in collection
	   System.out.println(contacts);

	   //search-SUCCESS
	   System.out.println(contacts.get("Yogesh"));

	   //search-FAIL
	   System.out.println(contacts.get("Ravi"));

	   //update
	   contacts.put("Shubham", 9828371083l);

       //view all elements in collection
	   System.out.println(contacts);
	}
}
