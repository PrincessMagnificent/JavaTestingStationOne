package testONE;

import java.util.ArrayList;

public class NakupovalniSeznam {
	
	//definiramo seznam 
	private ArrayList<String> seznam;
	
	public NakupovalniSeznam()
	{
		seznam = new ArrayList<String>();
	}
	
	public void dodaj(String potrebno) //void ker ni returna, rabimo pa povedat da je potrebno oblike string
	{
		this.seznam.add(potrebno);
	}

	public static void main(String[] args) {
		// TODO ustvar razred NakupovalniSeznam ki kot plje vsebuje arraylist<> seznam s stvarmi ki jih morate kupiti
		//napisi prazen konstruktor ki naredi zacetno vrednost, prazen seznam.
		//metodi dodaj in odstrani ki na seznam dodajata ali briseta 
		
		//v main naredi objekt TIPA NakupovalniSeznam  ki ima seznam z 5 stvarmi
		NakupovalniSeznam mojSeznam = new NakupovalniSeznam();
		
		mojSeznam.dodaj("Klobasa");
		mojSeznam.dodaj("Hren");
		
		for (String vnos : mojSeznam.seznam)
		{
			System.out.println(vnos);
		}
	}

}

