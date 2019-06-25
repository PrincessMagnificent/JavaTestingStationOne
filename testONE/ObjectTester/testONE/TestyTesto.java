package testONE;

public class TestyTesto {

	public static void main(String[] args) {
		// I'm just here to try out some more []

		
		Admin LucySpecial = new Admin("Accounting", 324, 2245, 1900, "Jimmy", 123442, "1992-09-09", "2009-11-23");
		
		System.out.println(LucySpecial.age + " " + LucySpecial.lengthOfMembership.getYears() + " yrs member");
		
		//Sporty ChadTheBully = new Sporty("never", "football", "Chad the Lad", 488324, TimeManagement.obtainMyDate(), TimeManagement.obtainMyDate());
		
		Sporty ChadTheBully = new Sporty("never", "football", "Chad the Lad", 488324, "1992-09-09", "2009-11-23");
		
		System.out.println(ChadTheBully.name + ": " + ChadTheBully.age);
		
		System.out.println(ChadTheBully.today);
		ChadTheBully.timeToNextEvent();
		
		System.out.println("NEXT EVENT: ");
		ChadTheBully.assignNextEvent();
		
		ChadTheBully.timeToNextEvent();
	}

}
