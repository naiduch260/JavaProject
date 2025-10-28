package Practice;

import java.util.Arrays;

public class SortingOrder {

	public static void main(String[] args) {
		String[] name= {"a", "c", "b", "d", "f", "e"};
		
		System.out.println("before sorting order is: " + Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After sorting orde is: " + Arrays.toString(name));
	}

}
