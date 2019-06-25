package testONE;

import java.time.LocalDate;
import java.time.Period;

public class Sporty extends Member {
	String nextEvent;
	String sport;
	
	public Sporty() {
		nextEvent = "never";
		sport = "unknown";
	}
	
	public Sporty(String nextEvent, String sport, String name, int idNumb, String bDayDate, String joinDate) {
		super(name, idNumb, bDayDate, joinDate);
		this.nextEvent = nextEvent;
		this.sport = sport;
	}
	
	
	public void assignSport(String incoming) {
		this.sport = incoming;
	}
	
	public String getSport() {
		return this.sport;
	}
	
	public void assignNextEvent() {
		this.nextEvent = TimeManagement.obtainMyDate();
	}
	
	public void timeToNextEvent() {
		if (this.nextEvent == "never") {
			System.out.println("there is no next event");
		} else {
			LocalDate nexxxt = LocalDate.parse(this.nextEvent);
			Period timeToEvent = Period.between(today, nexxxt);
			//System.out.println("Time to next event: " + timeToEvent);
			System.out.println("Time to next event: " + TimeManagement.TransformPeriodIntoWords(timeToEvent));
		}
	}
}
