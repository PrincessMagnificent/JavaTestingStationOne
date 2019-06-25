package testONE;

public class MemberManager {

	public static void main(String[] args) {
		//read filename from args, read member from file
		//begin by just doing an array of names, later we'll get more done
		String chosen = args[0];
		System.out.println("Chosen file from args is " + chosen);
		System.out.println("CONTENTS: \n");
		TextIO.readFile(chosen);
		String readline = TextIO.getln();
		while (!TextIO.eof()) {
			
			System.out.println(readline);
			readline = TextIO.getln();
		}
		System.out.println(readline + "\n\n###content ends here###\n"); //last line because we stopped reading when we reached the end of the file but we hadn't printed yet
		//each time you go getln() it moves one line down the file
		
		String command = "";
		System.out.println("type q to quit!");
		TextIO.writeFile(chosen);
		
		while (!command.equalsIgnoreCase("q")) {
			TextIO.readStandardInput();
			command = TextIO.getln();
			
			if (!command.equalsIgnoreCase("q")) {
				
				TextIO.putln(command);
			}
			// the way this is set up right now, he overwrites things every time we do a line
			// but that's because we do writeFile every time
			// the secret is that writeFile and readFile are two different things and don't need to be the same. You can read standardInput and write to somewhere else. Which makes sense that it would work that way, really.
			
		}
		
		//now to figure out HOW DO WE APPEND TO FILE, THAT IS BIG QUESTION
		
		System.out.println("-------------terminated--------------");
	}

	public static void openMemberForEditing(String obtainedLine, String LexiconLine) {
		String[] myMemberArray = obtainedLine.split(";");
		String[] lexiconArray = LexiconLine.split(";");
		
		int lexlength = lexiconArray.length;
		
		for (int x = 0; x < lexlength; x++) {
			System.out.println(lexiconArray[x] + ": " + myMemberArray[x]);
		}
		
		//Member(String name, int membershipNo, String birf, String joinnn
		//NAME;SURNAME;EMAIL;PHONE;ADDR-CITY;ADDR-STREET;BDAY;MEMBRNOMBR;JOINDATE
		Member myMember = new Member(myMemberArray[0] + " " + myMemberArray[1], Integer.parseInt(myMemberArray[7]), myMemberArray[6], myMemberArray[8]);
		
		System.out.println(myMember.age);
		
	}

}
