package Practice;

public class Palindrome {

	public static void main(String[] args) {
		String name = "racar";
		boolean isPalindrome = true;

		int i = 0;
		int j = name.length() - 1;

		while (i < j) {
			if (name.charAt(i) != name.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		if (isPalindrome) {
			System.out.println(name + ": it is a palindrome");
		} else {
			System.out.println(name + ": it is not a palindrome");
		}
	}

}
