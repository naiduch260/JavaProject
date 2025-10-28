package Practice;

public class CountNumberOfEvenOddNumbersInNumbers {

	public static void main(String[] args) {
		int[] i= {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16};
		
		int even=0;
		int odd=0;
		
		for(int num : i) {
			if(num%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even count is: " + even);
		System.out.println("odd count is: " + odd);
	}

}
