package testONE;
import java.time.*;

public class BirthdayMaker {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		TextIO.putln("AGE");
		int ageDesire = TextIO.getInt();
	
		
		LocalDate then = today.minusYears(ageDesire);
		
		System.out.println("TODAY : " + today);
		System.out.print(ageDesire + "yrs AGO : " + then);
	}

}
