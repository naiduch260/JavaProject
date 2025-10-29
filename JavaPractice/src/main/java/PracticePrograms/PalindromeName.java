package PracticePrograms;

public class PalindromeName {

	public static void main(String[] args) {
		String name="raycar";
		boolean isPalindrome=true;
		
		int i=0;
		int j=name.length()-1;
		
		while(i<j) {
			if(name.charAt(i) != name.charAt(j)) {
				isPalindrome=false;
				break;
			}
			i++;
			j--;
		}
		if(isPalindrome) {
			System.out.println(name + " :is a palindrome");
		}else {
			System.out.println(name + " :it is not a palindrome");
		}
	}

}
