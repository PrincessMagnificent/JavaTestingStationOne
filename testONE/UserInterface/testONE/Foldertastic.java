package testONE;
import java.io.*;
import java.util.*;


public class Foldertastic {
	// find usable files, label them for opening
	// open file, display members inside
	// write new temporary file
	
	public static int getSomeChoice(int usableLength) {
		//we tell 'em that they can't go above this certain number we supply

		int myChoice = TextIO.getInt();

		while (myChoice >= usableLength) {
			System.out.println("Out Of Bounds Error, Reboot Cheese? insert small token");
			myChoice = TextIO.getInt();
		}

		return myChoice;
	}
	
	public static List<String> openFileReturnList(File fileName) throws Exception{
		
		//openFileReturnList gets a File and returns it as a List<String> with every line being an invididual entry
		FileReader fw = new FileReader(fileName);
		BufferedReader dat = new BufferedReader(fw);
		
		//Behold the magnificence of the arraylist, it is like an array[] but you can add to it whenever you want, which is what I desperately need to do
		// cannot just go new List<string> because list is just an interface for arraylist so I needed to do the below
		List<String> result = new ArrayList<String>();
		
		while (dat.ready()) {
			result.add(dat.readLine());
		}
		
		
		dat.close();
		fw.close();
		return result;
	}

	
	
	public static void main(String[] args) throws Exception {
		System.out.println("########RUN:startSTATE:#######");
		
		System.out.println("LOAD DATABASE?");
		
		Scanner keyInput = new Scanner(System.in);
		
		File[] usableFiles = findFilesInFolder();
		final int usableLength = usableFiles.length;
		
		for (int x = 0; x < usableLength; ++x ) {
			System.out.println(x + ": " + usableFiles[x].getName());
		}
		
		System.out.println("WHICH ONE DO YOU LIKE (0-" + (usableLength - 1) + ")");
		
		int myChoice = getSomeChoice(usableLength);
		
		System.out.println("SELECTERD " + myChoice + " : " + usableFiles[myChoice]);
		
		List<String> myResult = openFileReturnList(usableFiles[myChoice]);
		int myResultSize = myResult.size();
				
		for (int i = 0; i < myResultSize; i++) {
			System.out.println(i + ") " + myResult.get(i));
		}
		
		System.out.println("\nEDIT CHOICE?");
		myChoice = getSomeChoice(myResultSize);
		
		String[] universalGuideLine = myResult.get(0).split(";");
		String[] selectedUserLine = myResult.get(myChoice).split(";");
		
		System.out.println("Chose " + universalGuideLine[0] + ": " + selectedUserLine[0]);
		
		for (int i = 0; i < universalGuideLine.length; i++) {
			System.out.println(i + ") " + universalGuideLine[i] + ": " + selectedUserLine[i]);
		}
		// we have here a pretty good system for editing one line of our CSV file
		
		while (true) {	
			System.out.println("What are we editing??");
			myChoice = getSomeChoice(universalGuideLine.length);

			//current setup just asks me to rename the same city over and over instead of, after asking me the city, offering other things to rename 

			try {
				System.out.println(" editing " + universalGuideLine[myChoice] + ": " + selectedUserLine[myChoice]);
				System.out.print(">>");
				String whatWasTyped = keyInput.nextLine();
				selectedUserLine[myChoice] = whatWasTyped;
				System.out.println(" edited WIN!! " + universalGuideLine[myChoice] + ": " + selectedUserLine[myChoice]);
			} catch(Exception e) {
				System.out.println("I gues you didn't really wanna");
			}

			System.out.println("Confirm change?");
			boolean CONFIRMATION = UserInterfaceV002.confirmAction();

			if (CONFIRMATION) {
				for (int i = 0; i < universalGuideLine.length; i++) {
					System.out.println(i + ") " + universalGuideLine[i] + ": " + selectedUserLine[i]);
				}
			} else {
				System.out.println("I gues you didn't really wanna");
			}

			System.out.println("edit more?");
			CONFIRMATION = UserInterfaceV002.confirmAction();

			if (CONFIRMATION) {
				System.out.println(" once more we go, we go ever on ");

			} else {
				break;
			}
		}


		System.out.println("######END:completeSTATUS:#####");

	}

	public static File[] findFilesInFolder() {
		//finds all the files in our working folder that contain a particular line so we can focus on opening only CSV files


		File dir = new File(".");

		File[] files = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				boolean result;

				if(name.contains("csv")){
					result=true;
				}
				else {
					result=false;
				}

				return result;
			}
		});

		return files;

	}

}
