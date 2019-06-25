/*Pridno delamo s tabelami, sestavimo tabelo in jo izpisemo
 * 
 * */
public class Tabeloid1 {

	public static void main(String[] args) {
		int[] tabela = new int[11];
		tabela[0] = 1;
		System.out.println(tabela[0]);
		for (int i = 1; i <=10; ++i) {
			tabela[i] = tabela[i-1]*i;
			System.out.println(tabela[i]);
		}
		
		String[] teden = new String[]{"Ponedeljek","Torek","Sreda","Cetrtek","Petek","Sobota","Nedelja"};
		for (int i = 0; i < teden.length; i++) {
			System.out.println(teden[i]);
		}
		
		//TODO dve tabeli, ena ime prijateljev, druga starosti, in izpisi stavke "friend Y is X years old"
		//TODO FOR REAL THIS TIME fibonannciejvo stvilo za ppoljibnih n stevil 
		
		//and now we have 1000 dolla and we have 3% increase each month, how much moneys do we have in one year
		
		double[] inflation = new double[13];
		inflation[0] = 1000d;
		System.out.println("Month 1 = " + inflation[0] + "€");
		
		for (int i = 0; i < (inflation.length - 1); i++) {
			inflation[i+1] = inflation[i] * 1.03;
			System.out.println("Now in Month " + (i+1) + " the  money is amazingly " + inflation[i+1] + "€");
		}
		
	}

}
