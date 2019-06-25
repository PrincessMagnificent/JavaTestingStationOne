package testONE;

public class Basket {
	//Fields
	private int noWhite;
	private int noRed;
	
	//Constructors
	public Basket() {
		noRed = 0;
		noWhite = 0;
	}
	
	public Basket(int red, int white) {
		noRed = red;
		noWhite = white;
	}
	
	//Methods
	public String inform() 
	{
		String result = "RED = " + noRed + ", WHITE = " + noWhite;
		return result;
	}
	
	public void setRed(int x) {
		noRed = x;
	}
	
	public void setWhite(int x) {
		noWhite = x;
	}
	
	public void moveToRed() {
		this.noRed = this.noRed + this.noWhite;
		this.noWhite = 0;
	}
	
	public void moveToWhite() {
		this.noWhite = this.noRed + this.noWhite;
		this.noRed = 0;
		
	}
	

}
