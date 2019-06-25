package testONE;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadAndFlip {
	

	public static String Obrni(String line) {
		StringBuilder workingLine = new StringBuilder();
		int length = line.length();
	
		
		
		for (int i = 0; i < length; i++) {
			workingLine.append(line.charAt(length - i - 1));
		}
		String newLine = workingLine.toString();
		return newLine;
	}
	public static void main(String[] args) throws Exception {
		InputStreamReader vt = new InputStreamReader(System.in);
		BufferedReader vhod = new BufferedReader(vt);
		
		System.out.print("ENTER STRING: ");
		String niz = vhod.readLine();
		System.out.println(Obrni(niz));
	}

}
