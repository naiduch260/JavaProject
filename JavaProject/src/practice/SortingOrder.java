package Practice;

import java.util.Arrays;

public class SortingOrder {

	public static void main(String[] args) {
//		sorting numbers
		int[] i= {1, 3, 2, 4, 6, 5, 8, 7, 10, 9};
		System.out.println("before sorting number is: " + Arrays.toString(i));
		Arrays.sort(i);
		System.out.println("after sorting number is: " + Arrays.toString(i));
		
//		sorting strings
		String[] name= {"a","c","b","d","f","e"};
		
		System.out.println("before sorting String is: " + Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After sorting String is: " + Arrays.toString(name));
	}

}
