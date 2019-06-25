package testONE;
// preberi najmanj 10 stevil iz argumentov, uporabi zanko for in izpisi stevilo sodih stevil in stevilo stevil ki delijo stevilo 100
public class LongTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tabela = new int[args.length];
		int soda = 0;
		int deli100 = 0;
		
		//pretvorimo string elemente v int elemente
		for (int i = 0; i < args.length; ++i) {
			tabela[i] = Integer.parseInt(args[i]);
		}
		
		//next we test and add to the counters
		
		for (int i: tabela) {
			System.out.println(i);
			if (i % 2 == 0) {
				System.out.println("Divisible by 2");
				soda++;
				
			}
			if (i % 10 == 0) {
				System.out.println("DIBISIBL BY 100");
				deli100++;
			}
		}
		
		System.out.println(tabela.length);
		System.out.println("Divisible" + soda + deli100);
		
	}

}
// tole je naloga prestevanje elementv