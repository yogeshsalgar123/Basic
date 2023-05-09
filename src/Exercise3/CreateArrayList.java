package Exercise3;

import java.util.ArrayList;

public class CreateArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList();
		
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		
		a1.remove(4);  //delete by index
		
		System.out.println(a1);
		
		System.out.println(a1.contains(10));	

	}

}
