package testONE;

public class BeriParameter {

	public static void main(String[] args) {
		//This just prints out what the args are
		/*for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}*/
		
		int numbah = Integer.parseInt(args[0]);
		int fakulteta = 1;
		
		for (int i = 1; i <= numbah; i++) {
			fakulteta = fakulteta * i;
		}
		
		System.out.println(numbah + "! = " + fakulteta);
		
		
	}

}
