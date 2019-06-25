package testONE;
import java.io.*;
import java.time.LocalDate;

public class ReadMyCSV {

	public static void main(String[] args) {
		System.out.println("###########RUNTIME//START###########");
		
		TextIO.readFile("komma.csv");
		
		String memberLegend = TextIO.getln();
		String[] memberSeparated = memberLegend.split(";");
		int i = 0;
		for (String datathingy : memberSeparated) {
			System.out.println(i + " " + datathingy);
			i++;
		}
		
		while (!TextIO.eof()) {
			String[] person = TextIO.getln().split(";");
			System.out.println("My name is " + person[0] + " " + person[1] + " and I live in " + person[4]);
			
			//public Member(String name, int membershipNo, String birf, String joinnn) {
			//in komma.csv the string is already shaped for perfect parsing by localDate, but the actual parsing takes place WITHIN the MEMBER CLASS
			
			Member aGuy = new Member(person[0],Integer.parseInt(person[7]),person[6],person[8]);
			
			//System.out.println(person[6]);
			//System.out.println(person[8]);
			
			aGuy.reportForDuty();
			
		}
		//public Member(String name, int membershipNo, LocalDate bDay, LocalDate joinDate)
		
		System.out.println("###########ENDTIME//FINISH##########");

	}

}
