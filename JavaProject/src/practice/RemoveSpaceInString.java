package Practice;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String str = "Hello World Java";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') { // condition to skip spaces
				result.append(c);
			}
		}

		System.out.println(result.toString());
	}

}
