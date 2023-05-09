package Streams;

import java.util.Arrays;
import java.util.List;

public class word2 {

	public static void main(String[] args) {
		List<String> words =Arrays.asList("Yogesh","Ankesh","Abhiranjan","prajwal");

	//	words.stream().forEach(name -> System.out.println(name));
		words.stream().forEach(System.out::println);

	}

}
