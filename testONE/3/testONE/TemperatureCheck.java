package testONE;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO argument je zunanja temperatura, in napiše, kako naj se obleces - bunda jakna dolgaMajca kratkaMajca
		int temp = Integer.parseInt(args[0]);
		int upper = 40;
		int lower = -20;
		boolean goOut = true;
		
		if (temp > upper || temp < lower) {
			goOut = false;
		}
		
		if (goOut) {
			if (temp < 5) {
				System.out.println("Daj si bundo.");
			}	else if (temp < 15) {
				System.out.println("Daj si jakno.");
			}	else if (temp < 24) {
				System.out.println("Daj si majco z dolgimi rokavi.");
			}	else {
				System.out.println("Poletje je in majce z kratimi rokavi so na vrsti.");
			}
		}	else {
			System.out.println("Are you crazy, stay indoors");
		}
		
	}

}
