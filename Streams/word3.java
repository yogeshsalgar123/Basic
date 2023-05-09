package Streams;

import java.util.Arrays;
import java.util.List;

public class word3 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Hurray","Ah","ohh","batman");
		words.stream().map(s->s+"!").forEach(System.out::println);

	}

}
