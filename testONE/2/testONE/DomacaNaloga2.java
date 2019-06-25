package testONE;

public class DomacaNaloga2 {

	public static void main(String[] args) {
		// TODO generate fibbonacci sequence that is N long
		//Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1.
		//1, 1, 2, 3, 5, 8, 13 and 21.
		//0  1  2  3  4  5  6       7
		int n = Integer.parseInt(args[0]);
		System.out.println("CALCULATING FFIBBONNACCII SEQUENCE N = " + n);
		
		int[] zaporedje = new int[n];
		zaporedje[0] = 1;
		zaporedje[1] = 1;
		for (int i = 2; i < n; ++i) {
			zaporedje[i] = zaporedje[i-1] + zaporedje[i-2];
		}
		System.out.print("SEQUENCE: ");
		
		for (int i = 0; i < n; ++i) {
			System.out.print(" " + zaporedje[i]);
		}

	}

}
