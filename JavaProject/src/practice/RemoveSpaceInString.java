package Practice;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		String name = "p ra s ad";
		char[] nameArray=name.toCharArray();
		
		String removeSpace="";
		for(char c :nameArray) {
			if(c !=' ') {
				removeSpace+=c;
			}
		}
		System.out.println(removeSpace);
	}

}
