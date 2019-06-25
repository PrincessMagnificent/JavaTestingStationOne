package testONE;

public class Zacetnica {

	public static void main(String[] args) {
		char starter = args[0].charAt(0);
		
		switch(starter) {
			case 'a': 
				System.out.println("Aleksander");
				break;
			case 'k':
				System.out.println("Katarina");
				break;
			case 'e':
				System.out.println("Emily");
			default:
				System.out.println("NOTHING IN MY DATABASE");
		}
	}

}
