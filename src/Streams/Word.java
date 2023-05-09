package Streams;

import java.util.Arrays;
import java.util.List;

public class Word {
	public static void main(String[] args) {
		List<String> words =Arrays.asList("Yogesh","Ankesh","Abhiranjan","prajwal");
	    words.stream().forEach(name ->System.out.println(" "+name));
	}

}
