package com.streamApi;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
	List<String> words =Arrays.asList("Harry","Micky","Ronaldo","Batman","Spiderman");
	
	
	words.stream().filter(s->s.length()<7).forEach(System.out::println);
	System.out.println();
	
	words.stream().filter(s->s.contains("i")).forEach(System.out::println);
	System.out.println();
	
	
	words.stream().filter(s->s.length()%2==0).forEach(System.out::println);
	

	}

}
