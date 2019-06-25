//BOOKFLARE JAVA 6th EDITION BOOK

package testONE;
import java.nio.file.*;
import java.util.Scanner;

//we're testing if i even have nio, it's a late addition to java

public class SixthEditionFileIO {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault(); //this comes from nio
		
		System.out.println("WELCOME");
		
		System.out.println(fs.getSeparator()); //what are directories separated by?
		
		//for converting relative paths to absolute paths
		String name;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file name >> ");
		name = keyboard.nextLine();
		Path inputPath = Paths.get(name);
		Path fullPath = inputPath.toAbsolutePath();
		System.out.println("Full path is " + fullPath.toString());

		
		keyboard.close();
		
		
		System.out.println("GOODBYE");

	}

}
