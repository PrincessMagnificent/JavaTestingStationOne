/*NALOGA 1: Definiraj pet spremenljivk različnih tipov, določi jim neke vrednosti in na zaslon izpiši ime in vrednost*/

class VajaEna {
	public static void main(String[] args) {
		//pet spremenljivk
		boolean resnica = true;
		char simbol = 'k';
		short kratka = 2000;
		long dolga = 1000000000000L; //NOTICE THE L AT THE END TO SPECIFY IT'S A LONG
		float ulomek32 = 22 / 7F; //NOTICE THE F AT THE END
		
		System.out.println("resnica = " + resnica);
		System.out.println("simbol = " + simbol);
		System.out.println("kratka = " + kratka);
		System.out.println("dolga = " + dolga);
		System.out.println("ulomek32 = " + ulomek32);
	}
}
