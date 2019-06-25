package testONE;

import java.time.*;


public class SecondaryFileObjectives {

	public static void main(String[] args) {
		TextIO.putln("###############START#############");
		
		TextIO.putln("Time to do some object work.");
		TextIO.putln("red: ");
		int red = TextIO.getInt();
		TextIO.putln("white: ");
		int white = TextIO.getInt();
		int green = TextIO.getInt();
		
		
		Basket kosarca = new Basket(red,white);
		
		
		char command = 'z';
		
		
		while (command != 'Q' && command != 'q') {
			System.out.println(kosarca.inform());
			System.out.println("we didn't use green but it's " + green);
			System.out.println("\nCommands:\nA) Move all to Red \nB) Move all to White \nQ) Quit");
			command = TextIO.getlnChar();
			switch(command) {
				case 'A':
					System.out.println("Selected a");
					kosarca.moveToRed();
					break;
				case 'B':
					System.out.println("Selected b");
					kosarca.moveToWhite();
					break;
					
				case 'q':
				case 'Q': 
					System.out.println("GODBY");
					break;
		  
				default:
					System.out.println("Not an option.");
			}
		}
		
		
		TextIO.putln("################END##############");
		/////
		LocalDate localDate = LocalDate.now();
		LocalDate differentDate = LocalDate.parse("2018-11-05");
		System.out.println(localDate);
		System.out.println(differentDate);
		Period diffo = Period.between(localDate, differentDate);
		System.out.println("Difference is " + diffo.getYears() + " years, " + diffo.getMonths() + " months, " + diffo.getDays() + " days");

	}

}
