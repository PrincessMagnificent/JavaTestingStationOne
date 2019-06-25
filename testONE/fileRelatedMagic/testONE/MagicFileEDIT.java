package testONE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class MagicFileEDIT {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("###########RUNTIME//START###########");
		
		//Let us see what files exist to read
		//System.out.println(File(System.getProperty("user.dir")).getAbsolutePath());

		//list all files that are potentially openn to us
		
		
		/*File dir = new File(".");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
			if (file.isFile()) {
				if (file.getName().contains(".txt")) {
					System.out.println(file.getName());
				}
			}
		}


		InputStreamReader vt = new InputStreamReader(System.in);
		BufferedReader vhod = new BufferedReader(vt);

		System.out.print("ENTER COMMAND: ");
		String niz = vhod.readLine();
		String konec = ".txt";
		String workedLine;
		int i = 0;
		*/
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
		
		for (String lll : myFileArrayed) {
			if (lll != null) {
				System.out.println(lll);
				String[] lineBeingObserved = lll.split(";");
				if (lineBeingObserved[0].contentEquals("Y")) {
					myFileChanged[y] = lll;
					y++;
					
				}
			}
		}
		
		System.out.println("~~~~~~~~~~~~~~");
		
		for (String lll: myFileChanged) {
			System.out.println(lll);
		}
		
		
		for (String lll : myFileChanged) {
			if (lll != null ) {
				printyfriend.write(lll);
				printyfriend.write("\n");
				}
		}
		
		printyfriend.flush();

		dat.close();
		printyfriend.close();

		File renamable = new File(niz + ".tmp");
		System.out.println("opened " + niz + ".tmp");
		File renamed = new File(niz + "2.csv");
		System.out.println("rename to " + niz + "2.csv");
		File DIFFERENTFILE = new File("razkor.txt");
		
		
		//renamable.delete();
		System.out.println("Does renamable file " + renamable.getName() + " exist, " + renamable.exists());
		System.out.println("Does DIFFERENT file " + DIFFERENTFILE.getName() + " exist, " + DIFFERENTFILE.exists());
		if (renamable.renameTo(DIFFERENTFILE)) {
			System.out.println("Worked");
			
		} else {
			System.out.println("failed");
		}
		
		//renamable.delete();
		//renamable.renameTo(renamed);
		
		//okay so the big puzzle is, why is it failing to rename. That is the question
		
		//turns out you can only ename to a file if the file doesn't already exist.

		System.out.println("###########ENDTIME//FINISH##########");

	}

}
