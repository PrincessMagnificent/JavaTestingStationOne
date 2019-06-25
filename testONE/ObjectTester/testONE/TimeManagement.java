package testONE;
import java.time.*;

public class TimeManagement {
	
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
	
	public static String ObtainFormattedDate(int Year, int Month, int Day ) {
		
		
		String finalProduct = "";
		
		finalProduct = Integer.toString(Year) + "-" + Integer.toString(Month) + "-" + Integer.toString(Day);
		
		return finalProduct;
	}
	
	public static String TransformPeriodIntoWords(Period p) {
		String myString = p.getYears() + " years, " + p.getMonths() + " months, " + p.getDays() + " days";
		
		return myString;
	}

	public static void main(String[] args) {
		System.out.println("###########RUNTIME//START###########");
		
		//int myYear = 0;
		//int myMonth = 0;
		//int myDay = 0;
		
		System.out.println("BIRTHDAY");
		String bDayString = obtainMyDate();
		System.out.println("JOINDAY");
		String joinDayString = obtainMyDate();
		
		LocalDate bDay = LocalDate.parse(bDayString);
		LocalDate joinDate = LocalDate.parse(joinDayString);
		LocalDate today = LocalDate.now();
		int age;
		Period lengthOfMembership;
		
		
		//I need bDay, joinDate, and that's the question isn't it, how to obtain dates
		age = Period.between(bDay, today).getYears();
		lengthOfMembership = Period.between(joinDate, today);
		
		
		
		
		
		
		System.out.println("AGE: " + age);
		System.out.println("MEMBER FOR " + lengthOfMembership.getYears() + " TIME");
		System.out.println("JOINED IN THE MONTH OF " + joinDate.getMonth() + ", DAY OF " + joinDate.getDayOfMonth());
		
		System.out.println("###########ENDTIME//CEASE###########");

	}

}
