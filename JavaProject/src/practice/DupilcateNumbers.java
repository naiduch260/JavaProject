package Practice;

public class DupilcateNumbers {

	public static void main(String[] args) {
		int[] number= {1,2,3,4,1,3,2,3,2,3,4,5,6,7,8,5,7,4,6,3,2,8,9,7,0,8,0,6,5,4};
		int num=0;
		int count=0;
		for(int value : number) {
			if(value==num) {
				count++;
			}
		}
		System.out.println("number of reapeet times: " + count);
	}

}
