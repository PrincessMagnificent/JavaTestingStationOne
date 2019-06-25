package testONE;

public class SpinRound {

	public static void main(String[] args) throws Exception{
		try {
			
			String line = args[0];
			System.out.println(line);
			System.out.println(line.charAt(1));
			System.out.println("It Worked.");
			
			
			System.out.println(Obrni(line));
			System.out.println("It Worked.");
			
			
			
		} catch (Exception ex){
			System.out.println("It Didn't Worked.");
		}

	}
	public static String Obrni(String line) {
		StringBuilder workingLine = new StringBuilder();
		int length = line.length();
	
		
		
		for (int i = 0; i < length; i++) {
			workingLine.append(line.charAt(length - i - 1));
		}
		String newLine = workingLine.toString();
		return newLine;
	}

}
