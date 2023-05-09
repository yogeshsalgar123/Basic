package com.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String args [] )
	{
		Map<String,Integer> map=new HashMap<String,Integer>();  
		map.put("Maths",500);
		map.put("chemistry",200);
		map.put("physics",100);
		
		System.out.println(map);  //  Ascending order based on key

		

		
	}
}
