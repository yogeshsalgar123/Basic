package Streams;

import java.util.Arrays;
import java.util.List;

public class UpperCaseWord {

	public static void main(String[] args) {
		List<String> words= Arrays.asList("yogesh","ankesh","abhiranjan","prajwal");
		words.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
