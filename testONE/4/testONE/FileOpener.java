package testONE;
import java.io.*;

public class FileOpener {
	//argument = Predavanje2.txt
	//remember what the working directory is because IT MATTERS

	public static void main(String[] args) throws Exception {
		String ime = args[0];
		
		BufferedReader dat = new BufferedReader(new FileReader(ime));
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		//System.out.println(File(System.getProperty("user.dir")).getAbsolutePath());
		
		//list all files that are potentially openn to us
		File dir = new File(".");
		File[] filesList = dir.listFiles();
		for (File file : filesList) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }
		}
		
		//reads the file in the argument
		while(dat.ready()) {
			System.out.println(dat.readLine());
		}
		dat.close();

	}

}
