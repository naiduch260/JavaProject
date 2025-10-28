package Practice;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] i= {1,2,3,4,5,6,7,8,9,10};
		
		for(int num : i) {
			if(num % 2 == 0) {
				System.out.println("Even numbers are: " + num);
			}
		}
	}

}
