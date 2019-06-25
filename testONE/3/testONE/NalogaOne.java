package testONE;
/*doo this:
 * 0|1|4|5
 * 1|2|3|0
 * 0|0|1|0
 * 3|2|1|7
 * 
 * 
 * 
 * */

public class NalogaOne {

	public static void main(String[] args) {
		int[][] myMatrix = new int[4][];
		myMatrix[0] = new int[4];
		myMatrix[1] = new int[4];
		myMatrix[2] = new int[4];
		myMatrix[3] = new int[4];
		
		int[] listOfNUM = new int[]{0,1,4,5,1,2,3,0,0,0,1,0,3,2,1,7};
		
		int counter = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int y = 0; y < 4; y++) {
				myMatrix[i][y] = listOfNUM[counter];
				counter++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.print("|");
			for (int y = 0; y < 4; y++) {
				System.out.print(myMatrix[i][y] + "|");
			}
			System.out.println("");
		}
		
		

	}

}
