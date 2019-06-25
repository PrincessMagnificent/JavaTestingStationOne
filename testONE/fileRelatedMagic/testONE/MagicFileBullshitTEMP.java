package testONE;

import java.io.*;

public class MagicFileBullshitTEMP {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		System.out.println("###########RUNTIME//START###########");
		
		InputStreamReader vt = new InputStreamReader(System.in);
		BufferedReader vhod = new BufferedReader(vt);
		
		System.out.print("ENTER COMMAND: ");
		String niz = vhod.readLine();
		String konec = ".txt";
		String workedLine;
		int i = 0;
		
		//that was reading from the command line, now let us read a file.
		
		FileReader fr = new FileReader(niz+konec);
		BufferedReader dat = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(niz + ".tmp");
		BufferedWriter printyfriend =  new BufferedWriter(fw);
		
		while (dat.ready()) {
			if (i % 2 == 0) {
				workedLine = dat.readLine().replace('e', 'y');
				printyfriend.write(workedLine);
			} else {
				workedLine = dat.readLine().replace('i', 'e');
				printyfriend.write(workedLine);
			}
			
			if ( i < 60) {
				System.out.println(workedLine);
			}
			
			
			i++;
		}
		
		dat.close();
		printyfriend.close();
		
		File renamable = new File(niz + ".tmp");
		File renamed = new File(niz + "2.txt");
		
		renamable.renameTo(renamed);
		renamable.delete();
		
		
		System.out.println("###########ENDTIME//FINISH##########");
	}

}
