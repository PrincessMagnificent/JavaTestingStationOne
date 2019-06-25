package testONE;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class UserInterfaceV002 {
	
	public static void addPause() {
		//the purpose of this method is to ask the user to press any key before moving on to the next thing, so that you aren't thrown immediately into the main menu again or something of that nature.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n(enter any input to continue. . .)");
		
		String throwaway = scan.nextLine();
		
	}
	
	public static char charcommand() throws Exception {
		//asks the user to input a command and returns the first character of that command in CHAR form in lower case
		char chara = 'x';
		
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader bufread = new BufferedReader(ISR);
		
		String charastring = bufread.readLine();
		
		try { 
			chara = charastring.charAt(0);
			chara = Character.toLowerCase(chara);
		} catch (Exception e) {
			System.out.println("charastring did not make it");
		}
		
		return chara;
	}
	
	public static boolean confirmAction() throws Exception{
		boolean confirmation = false;
		boolean thisLoop = true;
		
		System.out.println("Are you sure (y/n)?");
		
		while (thisLoop) {
			
			char commandChar = charcommand();
			switch (commandChar) {
				case 'y':
					confirmation = true;
					System.out.println("YES");
					thisLoop = false;
					break;
				case 'n':
					confirmation = false;
					System.out.println("NO");
					thisLoop = false;
					break;
				default:
					System.out.println("\npress Y or N\n");
			}
		}
		
		return confirmation;
	}
	
	public static int intcommand() throws Exception {
		//obtains an integer, keeps bugging you until you give a good integer
		
		int n = 12;
		
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader bufread = new BufferedReader(ISR);
		
		String intCommandPrebrano = bufread.readLine();
		
		try {
			n = Integer.parseInt(intCommandPrebrano);
		} catch (Exception e) {
			System.out.println("that wasn't an int");
			n = intcommand();
		}
		return n;
	}
	
	public static void displayMembers(List<String> myResult) throws Exception {
		//runs after you have asked to display members
		
		

		
		
		//now notice this: because we are using arraylists and not arrays, we don't have length, we have size(), and we have get(x) instead of list[x]
		System.out.println("Select member, q to quit");
		
		int myResultSize = myResult.size();
		for (int x = 0; x < myResultSize; x++) {
			System.out.println(x + " : " + myResult.get(x));
		}
		
		int memberLookedAtClosely = Foldertastic.getSomeChoice(myResultSize);
		
		System.out.println("You have chosen to examine " + myResult.get(memberLookedAtClosely));
		
		try {
			MemberManager.openMemberForEditing(myResult.get(memberLookedAtClosely), myResult.get(0));
			
		} catch (Exception e) {
			System.out.println("NO WORKA");
		}
		
		
		addPause();
		
	}
	
	public static void addMembers() throws Exception {
		//runs the procedure to add a member to the roll
		System.out.println("ADDING MEMBER PROCEDURE INITIALIZE\n");
		
		//Member(String name, int membershipNo, formattedstring bDay, formattedstring joinDate)

		
		System.out.println("MEMBER NAME:___");
		String newName = TextIO.getln();
		System.out.println("ASSIGN MEMBERSHIP NUMBER:___");
		int membershipNo = TextIO.getInt();
		System.out.println("BORN ON? >>");
		String bDay = TimeManagement.obtainMyDate();
		
		System.out.println("JOINED ON??? >>");
		String joinDay = TimeManagement.obtainMyDate();
		
		Member gotMember = new Member(newName,membershipNo,bDay,joinDay);
		
		System.out.println("Added " + gotMember.name + ", ID:" + gotMember.membershipNo + ", born " + gotMember.bDay);
		gotMember.reportForDuty();
	}
	
	public static void createBackupDatabase(String databaseName) {
		//we're going to be messing with files so I'd be happy if we created a temporary file that was just a copy of our original file
		String[] FileAndEnd = databaseName.split("\\.");
		String newFileName = FileAndEnd[0] + ".tmp";
		System.out.println("new filename will be " + newFileName);
		
		//now to actually create a copy of a file.
		
		
	}
	
	public static void removeMembers(List<String> myResult) throws Exception {
		//runs the procedure to delete a member from the roster
		
		int resultLength = myResult.size();
		
		int[] MemberNoList = new int[resultLength];
		
		//what I am attempting here is to create a list of all the membership numbers in the guild
		
		for (int x = 1; x < resultLength; ++x) {

			String[] thisMemb= myResult.get(x).split(";");
			
			MemberNoList[x] = Integer.parseInt(thisMemb[3]); //the membership is in fourth place in my csv
		}
		
		for (int lll : MemberNoList) {
			System.out.println(lll);
		}
		
		System.out.println("REMOVE AND CANCEL\n");
		System.out.println("Member ID to destroy: ");
		int id = intcommand();
		System.out.println("You have selected Member " + id + "\nAre you sure you want to continue? (y/n)\n");
		char confirmation = charcommand();
		
		int toggle = 0;
		
		confirmAction();

		while (toggle < 1) {
			switch (confirmation) {
				case 'y':
					System.out.println("DELETING");
					toggle = 1;
					break;
				case 'n':
					System.out.println("nevermind then");
					toggle = 1;
					break;
				default:
					confirmation = charcommand();
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("LOADING INTERFACE...\nINTERFACE LOADED. WELCOME, USER.");
		
		InputStreamReader vt = new InputStreamReader(System.in);
		BufferedReader vhod = new BufferedReader(vt);
		
		//new protocol. Load database FIRST, then ask questions.

		System.out.println("MEMBERSHIP ROLLS\n");

		System.out.println("Select membership database");

		//all the csv files in the folder
		File[] usableFiles = Foldertastic.findFilesInFolder();
		int usableLength = usableFiles.length;

		for (int x = 0; x < usableLength; ++x ) {
			System.out.println(x + ": " + usableFiles[x].getName());
		}

		System.out.print("DATABASE NO.");
		int myChoice = Foldertastic.getSomeChoice(usableLength); //get a number between 0 and the last possible choice

		System.out.println("You chose " + usableFiles[myChoice].getName());

		//openFileReturnList gets a File and returns it as a List<String> with every line being an invididual entry
		List<String> myResult = Foldertastic.openFileReturnList(usableFiles[myChoice]);
		
		createBackupDatabase(usableFiles[myChoice].getName());
		
		System.out.println("DATABASE LOADED");

		System.out.print("Enter command. Q to quit");
		char commandChar = 'a';
		
		while (commandChar != 'q') {
			
			System.out.println("MAIN MENU\n\n(v)View Members \n(a)Add Member \n(r)Remove Member \n(c)Credits \n(q)Quit\n>>");
			commandChar = charcommand();
			switch (commandChar) {
				case 'v':
					displayMembers(myResult);
					break;
				case 'a':
					addMembers();
					break;
					
				case 'r':
					removeMembers(myResult);
					break;
					
					
				case 'q':
					System.out.println("Quit command detected.");
					break;
					
				case 'c':
					System.out.println("Copyright axioTech 2019 all rights reserved");
					break;
				default:
					System.out.println("NOT RECOGNIZED COMMAND, RETRY\n");
					break;
					
			}
		}
		
		System.out.println("PROGrAM EXITING...");
		vhod.close();
		vt.close();
		
	}
}
