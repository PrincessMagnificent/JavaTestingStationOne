package testONE;

public class TextTryThorough {

	public static void main(String[] args) {
		
		TextIO.putln("###############START#############");
		
		int w = TextIO.getlnInt();
		int wsqr = w * w;
		TextIO.putln(w + "^2 = " + wsqr);
		
		TextIO.writeUserSelectedFile();
		TextIO.putln(TextIO.getln());
		TextIO.writeStandardOutput();
		
		TextIO.putln("################END##############");
	}

}

//NOTE THAT WE HAD TO ADD TEXTIO.JAVA IN THE FOLDER FOR THIS TO WORK