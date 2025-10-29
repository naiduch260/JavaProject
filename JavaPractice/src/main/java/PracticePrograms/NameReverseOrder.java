package PracticePrograms;

public class NameReverseOrder {

	public static void main(String[] args) {
		String name="prasad";
		char[] c=name.toCharArray();
		
		String reverseName="";
		for(int i=c.length-1; i>=0; i--) {
			reverseName+=c[i];
		}
		System.out.println("reversed name is: " + reverseName);

	}

}
