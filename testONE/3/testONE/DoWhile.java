package testONE;

public class DoWhile {

	public static void main(String[] args) {
		int given = Integer.parseInt(args[0]);
		int given2 = given;
		int answer = 0;
		
		while (given2 > 0) {
			answer = answer + given2;
			--given2;
		}
		
		System.out.println("answer is " + answer);
		answer = 0;
		given2 = given;
		
		do {
			answer = answer + given2;
			--given2;
		} while (given2 > 0);
		
		System.out.println("answer is " + answer);
		answer = 0;
		given2 = given;
	}

}
