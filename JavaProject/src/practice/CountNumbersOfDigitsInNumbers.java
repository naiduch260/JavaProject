package Practice;

public class CountNumbersOfDigitsInNumbers {

	public static void main(String[] args) {
		int number=4357897;
		int count=0;
		
		while(number !=0){
			number=number/10;
			count++;
		}
		System.out.println(count);
	}

}
