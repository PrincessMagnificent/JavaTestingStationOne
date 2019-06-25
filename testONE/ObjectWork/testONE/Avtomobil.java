package testONE;

public class Avtomobil {
	
	// Polja
	private int prestava;
	private double hitrost;
	private String registracija;
	private double maxHitrost;

	// Konstruktorji:
	// Imajo enako ime kot razred,
	// izvedejo se ob uporabi kljucne besede new.
	// Uporabljamo jih za zacetne nastavitve stanj objektov
	public Avtomobil()
	{
		this.prestava = 1; //all this is default if no arguments are passed to constuctor
		this.hitrost = 0;
		this.registracija = "Neznana";
		this.maxHitrost = 180;
	}
	
	public int getPrestava()
	{
		return this.prestava;
	}
	
	public double getHitrost()
	{
		return this.hitrost;
	}
	
	public double getMaxHitrost()
	{
		return this.maxHitrost;
	}
	
	public String getRegistracija()
	{
		return this.registracija;
	}
	
	public void izpisiPodatke()
	{
		System.out.println("***   Podatki   ***");
		System.out.println("Prestava: " + this.getPrestava() + ".");
		System.out.println("Hitrost: " + this.getHitrost() + " km/h");
		System.out.println("Registracija: " + this.getRegistracija());
		System.out.println("Maksimalna hitrost: " + this.getMaxHitrost() + " km/h");
		System.out.println();
	}

	public static void main(String[] args) {
		
		Avtomobil mojAvto = new Avtomobil();
		mojAvto.izpisiPodatke();
		
		System.out.println("PROGRAM COMPLETE ALLGOOD");
	}

}
