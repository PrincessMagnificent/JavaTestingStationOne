package testONE;

public class SplitString {

	public static void main(String[] args) {
		String databaseName = "holonet.txt";
		
		//so there is a problem with splitting with ., because split() takes regular expressions
		//fuck regular expressions
		String[] splitfile = databaseName.split("\\.");
		
		for (String lll : splitfile) {
			System.out.println(lll);
		}

	}

}
