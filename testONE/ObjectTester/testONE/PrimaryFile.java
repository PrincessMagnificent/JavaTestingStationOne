package testONE;
import java.io.*;
import java.util.*;

public class PrimaryFile {
	
	public static InputStreamReader vt = new InputStreamReader(System.in);
	public static BufferedReader vhod = new BufferedReader(vt);


	
	public static int beriStevilko() {
		int stevilo = 18;
		return stevilo;
	}
	
	public static String tipkaKomanda() {
		try	{
			System.out.print("Vnesi poljuben niz: ");
			String a = vhod.readLine();
			return a;
			}
		catch (Exception ex) {
				System.out.println("No.");
				return "q";
			}
		}

	public static void main(String[] args) {
		String argumentGiven = args[0];
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		
		
		int fileNumber = 0;
		File dir = new File(".");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		    //if (file.isFile()) { //of course, dir gives you both files and folders and all I want is folders
				if (file.isFile())	{
					System.out.print("FILE ");
				} else if (file.isDirectory()) {
					System.out.print("DIR  ");
				}
		        System.out.println(fileNumber + " -- " + file.getName());
		        fileNumber++;
		    //}
		}
		System.out.println("Filenumb : " + fileNumber);
		
		//System.out.println("Argument supplied: " + argumentGiven);
		//System.out.println("You have selected [[" + filesList[15] + "]]");
		
		//this is where we pick the name of the file to open
		System.out.println("Which do you like");
		int chooseyourfate = TextIO.getInt();
		String ime = filesList[chooseyourfate].toString();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ime));
			//read the first line, split by an open space which we will later want to do with comma separated values instead
			String[] separated = reader.readLine().split(" ");
			
			//here we first print out the contents of the test file. 
			System.out.println("\n\nFILE BEING READ: " + ime);
			
			for (String unit : separated) {
				System.out.println("\t" + unit);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		
		System.out.println("\n\n\n################################################\n\n");
		
		String ukaz = "a";
		while (true) {
			
			
			//BIG IMPORTANT, java doesn't like == for strings, you must use string.equals(otherstring)
			ukaz = tipkaKomanda();
			System.out.println(ukaz + " " + ukaz.length());
			if (ukaz.equals("q") || ukaz.equals("Q")) {
				break;
			}
		
		}
		
		
		
		System.out.println("metoda deluje, stevilo je " + beriStevilko());
		
		System.out.println("All operations concluded. Program terminates.");
		
		//Objective: we have three baskets, NALOGA 5 vaje 6, v prvi 5 white 0 red potato, 2nd 3w 12r, 3rd 4w 10r. Create method prestaviKrompir for moving all red potato from 2nd and 3rd baasket into 1st, then all white from 1st and 2nd into 3rd.
		//also create method IZPIS ki pove koliko krompirjev je v kosari in jo poklice za vsako kosaro

	}

}
