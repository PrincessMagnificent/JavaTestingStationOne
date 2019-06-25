package testONE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class FileANDuser {
	
	public static String[] parseEntry(String csvValue) {
		String[] editables = csvValue.split(";");
		return editables;
	}
	
	public static void printArray(String[] myArray) {
		
		for (String lll : myArray) {
			System.out.print(lll + ";");
		}
	}
	
	public static String makeMyCSV(String[] myArray) {
		String finalstring = "";
		
		for (String lll : myArray) {
			finalstring = finalstring + lll + ";";
		}
		
		return finalstring;
	}

	public static void main(String[] args) throws Exception{
		System.out.println("###########RUNTIME//START###########");
		
		String niz = "condense";
		String konec = ".csv";
		
		//that was reading from the command line, now let us read a file.

		FileReader fr = new FileReader(niz+konec);
		BufferedReader dat = new BufferedReader(fr);

		FileWriter fw = new FileWriter(niz + ".tmp");
		BufferedWriter printyfriend =  new BufferedWriter(fw);
		
		int DATABASE = 8;
		int i = 0;
		String[] myFileArrayed = new String[DATABASE];
		String[] myFileChanged = new String[DATABASE];
		int y = 0;

		while (dat.ready()) {
			myFileArrayed[i] = dat.readLine();
			i++;
			
		}
		
		String command = "";
		BufferedReader vhod = new BufferedReader(new InputStreamReader(System.in));
		
		while (!command.equalsIgnoreCase("q")) {
			System.out.println("Press q to exit");
			
			for (int z = 0; z < myFileArrayed.length; z++) {
				System.out.println(z + " " + myFileArrayed[z]);
			}
			
			
			command = vhod.readLine();
			int numcommand = 100;
			
			try {
				numcommand = Integer.parseInt(command);
			} catch (Exception e){
				System.out.println(e + "\nNOT A NUMBER");
			}
			
			String[] obdelovano = parseEntry(myFileArrayed[numcommand]);
			
			System.out.println("%%%WORKSPACE%%%");
			printArray(obdelovano);
			obdelovano[1] = vhod.readLine();
			printArray(obdelovano);
			obdelovano[2] = vhod.readLine();
			printArray(obdelovano);
			
			myFileArrayed[numcommand] = makeMyCSV(obdelovano);
			
			

			
		}
		
		
		System.out.println("###########ENDTIME//CEASE###########");

	}

}
