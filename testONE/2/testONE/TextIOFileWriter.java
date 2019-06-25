package testONE;

public class TextIOFileWriter {

	public static void main(String[] args) {
		
		// TODO Right now we write to a file, overwriting what is there. Need to figure a way to ADD to file without erasing what we already have. Needs special methods
		
		System.out.println("###########RUNTIME//START###########");
		
		String name;
		String email;
		int phoneno;
		
		TextIO.putln("Good evening.");
		
		String koncnica = ".txt";
		String myfile;
		
		TextIO.putln("filename to create?");
		myfile = TextIO.getln();
		myfile += koncnica;
		
		
		
		TextIO.putln("Namae wa?");
		name = TextIO.getln();
		TextIO.putln("Pasokon no Emairu?");
		email = TextIO.getln();
		TextIO.putln("Denwa Bangou?");
		phoneno = TextIO.getInt();
		
		TextIO.writeFile(myfile);
		
		TextIO.putln("Name: " + name);
		TextIO.putln("Email: " + email);
		TextIO.putln("Phone No.: " + phoneno);
		
		TextIO.writeStandardOutput();
		
		
		System.out.println("###########STOPTIME//END3###########");
	}

}
