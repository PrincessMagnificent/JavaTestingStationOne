package testONE;

import java.time.*;

public class Member {
	//Fields
	//name, membership number, Bday, Joindate, LengthOfmembership, duesPaid
	String name;
	int membershipNo;
	LocalDate bDay;
	int age;
	LocalDate joinDate;
	Period lengthOfMembership;
	boolean duesPaid;
	LocalDate today = LocalDate.now();
	
	
	//Constructors
	//blind
	public Member() {
		name = "John Doe";
		membershipNo = 0;
		duesPaid = false;
		
	}
	
	public Member(String name, int membershipNo, String birf, String joinnn) {
		this.name = name;
		this.membershipNo = membershipNo;
		this.bDay = LocalDate.parse(birf);
		this.joinDate = LocalDate.parse(joinnn);
		
		age = Period.between(bDay, today).getYears();
		lengthOfMembership = Period.between(joinDate, today);
		
		duesPaid = false;
	}
	
	public void payDues() {
		duesPaid = true;
	}
	
	public void reportForDuty() {
		System.out.println("Member " + name + " has been reporting for duty for " + lengthOfMembership.getYears() + " years " + lengthOfMembership.getMonths() +  " months " + lengthOfMembership.getDays() + " days!");
	}	

}
