package Streams;

import java.util.Arrays;
import java.util.List;

public class word4 {

	public static void main(String[] args) {
		List<String> words= Arrays.asList("i","I","iceCream","island");
		words.stream().map(s->s.replace("i","eye")).forEach(System.out::println);
		//System.out.println();

	}

}
