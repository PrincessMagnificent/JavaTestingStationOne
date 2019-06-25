package testONE;

public class MetodaPrvic {
	
	public static int mojaFakulteta(int stevilo) { //prvi int je kaksen je return, drugi int je kaksno je stevilo
		int rezultat = 1;
		while (stevilo > 0) {
			rezultat = rezultat * stevilo;
			stevilo--;
		}
		return rezultat;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		
		int rezultat = mojaFakulteta(n);
		System.out.println(rezultat);

	}

}
