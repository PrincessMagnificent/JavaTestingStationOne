package testONE;
import java.io.*;
import java.time.*;


//currently the thing to do in this place is to finish createMember which asks for nformation about a member one at a time, and if things are confirmed, then we add the member to the CSV

public class CSVwriter {
	
	//Fields
	String CSVline[];
	
	
	
	//Constructors
	
	
	//Methods
	
	public static String displaySpaceLeft(int linesworthreading, int lines) {
		String X = "MEMORY : " + linesworthreading + "/" + lines;
		return X;
	}
	
	public static String multiSpaces(int recieved, int spaces) {
		String extended = Integer.toString(recieved);
		
		while (extended.length() < spaces) {
			extended = "0" + extended;
		}
		
		return extended;
	}
	
	public static String obtainMyDate() {
		
		//at present let us only concern ourselves with getting a date to work
		System.out.println("Give me a year (0-9999)");
		int givenYear = TextIO.getInt();
		System.out.println("Give me a month (1-12)");
		int givenMonth = 15;
		while (givenMonth > 12) {
			givenMonth = TextIO.getInt();
		}
		System.out.println("Give me a day (1-31)");
		int givenDay = 40;
		while (givenDay > 31) {
			givenDay = TextIO.getInt();
		}
		
		String somedayString = CSVwriter.multiSpaces(givenYear, 4) + "-" + CSVwriter.multiSpaces(givenMonth,2) + "-" + CSVwriter.multiSpaces(givenDay,2);
		
		
		
		return somedayString;
	}
	
	public static Member createMember() {
		System.out.println("i'm running createMember()");
		//public Member(String name, int membershipNo, LocalDate bDay, LocalDate joinDate) {	
		System.out.println("NAME??");
		String name = TextIO.getln();
		
		System.out.println("MEMBERSHIP NUMBER??");
		int membershipNo = TextIO.getInt();
		TextIO.getln();
		
		
		System.out.println("BIRTHDAY??");
		//LocalDate bDay = LocalDate.parse(CSVwriter.obtainMyDate());
		
		String betterday = TimeManagement.obtainMyDate();
		
		System.out.println("JOIN DATE??");
		//LocalDate joinDate = LocalDate.parse(CSVwriter.obtainMyDate());
		String betterjoin = TimeManagement.obtainMyDate();
		
		//public Member(String name, int membershipNo, String birf, String joinnn) {
		//in komma.csv the string is already shaped for perfect parsing by localDate, but the actual parsing takes place WITHIN the MEMBER CLASS
		Member createdMember = new Member(name, membershipNo, betterday, betterjoin);
		
		System.out.println(createdMember.name + " is " + createdMember.age + " years old and has been a member for " + createdMember.lengthOfMembership.getYears() + " years");
		
		return createdMember;		
	}
	
	public static void readMyCSV(String filename ) {
		TextIO.readFile(filename);
		
		String wholefile = "";
		String empties = "";
		int lines = 0;
		int linesworthreading = 0;
		
		
		
		while (!TextIO.eof()) {
			String retrievedLine = TextIO.getln();
			retrievedLine = retrievedLine.replace(":", "");
			wholefile = wholefile + retrievedLine + ":";
			
			if (retrievedLine.length() > 10) {
				linesworthreading++;
			} else {
				empties = empties + lines + ";";
			}
			
			lines++;
		}
		
		String[] tabela = wholefile.split(":");
	
		
		for (int x = 0; x < tabela.length; ++x) {
			System.out.println(x + "\t" + tabela[x] + "\t\t" + tabela[x].length());
		}
		
		System.out.println("MEMORY : " + linesworthreading + "/" + lines);
		System.out.println(CSVwriter.displaySpaceLeft(linesworthreading, lines));
		System.out.println(empties);
		
	}
	

	public static void main(String[] args) throws Exception {
		System.out.println("###########RUNTIME//START###########");
		
		CSVwriter.readMyCSV("komma2.csv");
		
		
		//public Member(String name, int membershipNo, LocalDate bDay, LocalDate joinDate) {
		TextIO.readStandardInput();
		
		System.out.println("JORDAN yes dan");
		
		UserInterfaceV002.createBackupDatabase("hightech.txt");
		
		/*int completeSwitch = 0;
		while (completeSwitch != 1) {
			Member MEMBO = CSVwriter.createMember(); //Create a member to write to the CSV form, display for confirmation purposes
			
			System.out.println("IS THIS GOOD TO YOU");
			
			TextIO.readStandardInput();
			
			TextIO.putln("Confirm?");
			String confirmation;
			
			TextIO.getln();
			// WHY IS THIS SOLITARY GETLN HERE???
			// When you called textio.getdouble() the program just takes the number entered and leaves the end of file symbol to be retrieved with the next GET statement. So in your code when you called textio.getln() it retrieved end of file and saved nothing because getln only takes the input from before the end of file character.
			// SOLUTION: extra getLN that eats the eof from the preceding one
			
			confirmation = TextIO.getln();
			System.out.println("letmecheck if you say yah");
			
			if (confirmation.equalsIgnoreCase("y") || confirmation.equalsIgnoreCase("yes")) {
				System.out.println("WRITING");
				completeSwitch = 1;
			}
			
		}*/
		
		System.out.println("###########ENDTIME//FINISH##########");

	}

}
