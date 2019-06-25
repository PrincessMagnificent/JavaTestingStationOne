package java2018;
import java.io.*;

public class ZapisiVDatoteko
{
	public static void main(String[] args) throws Exception
	{
		String ime = "BolshoyDatoteka.txt";

		FileWriter fw = new FileWriter(ime, true); //the TRUE makes it append, not overwrite
		PrintWriter dat = new PrintWriter(fw);

		dat.println("Prva vrstica v datoteki. qumureso");
		dat.println();
		dat.println("Zadnja vrstica v datoteki. Rikarko");
		dat.close();
		
		//remember that he isn't writing into /testONE/Dowloaded but just into /testONE/
		System.out.println("###CONCLUSION IN ALL THINGS##");
	}
}