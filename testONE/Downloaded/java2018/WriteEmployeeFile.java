package java2018;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class WriteEmployeeFile
{
	public static void main(String[] args) {

		// Convert the string to a
		// byte array.
		String s = "Hello World! ";
		byte data[] = s.getBytes();
		Path p = Paths.get("./logfile.txt");

		try (OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE, APPEND))) {
			out.write(data, 0, data.length);
			
		} catch (IOException x) {
			System.err.println(x);
		}
	}
}