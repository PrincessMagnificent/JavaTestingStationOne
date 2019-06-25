package testONE;

public class Admin extends Member {
	String position;
	int[] nominatedBy;
	
	//Constructors
	//blind
	public Admin() {
		position = "Unassigned";
		nominatedBy = new int[3];
	}
	
	public Admin(String position, int First, int Second, int Third, String name, int idNum, String bDayString, String joinDateString) {
		//("Jimmy", 123442, "1992-09-09", "2009-11-23");
		//this super word means that Admin goes to Member and uses that constructor
		super(name, idNum, bDayString, joinDateString);
		this.position = position;
		nominatedBy = new int[3];
		this.nominatedBy[0] = First;
		this.nominatedBy[1] = Second;
		this.nominatedBy[2] = Third;
	}

	
	
	//Methods
	
	public void setPosition(String newPosition) {
		this.position = newPosition;
	}
	
	public void removeFromPosition() {
		this.position = "Unassigned";
	}
	
	

}
