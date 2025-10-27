package Practice;

public class NameReverseOrder {

	public static void main(String[] args) {
		String name = "Prasad";
		char[] c = name.toCharArray();
		
		String reversName = "";
		for(int i=c.length-1; i>=0; i--) {
			reversName += c[i];
		}
		System.out.println("reversed name is: " + reversName);
	}

}
