import java.io.*;

public class Main {
	public static void main (String [] args) {
		int choice = 0;
		String input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
			//Display the main menu
			System.out.println("*******************************************");
			System.out.println("** Please choose an option below:        **");
			System.out.println("** 1) Reverse a string.                  **");
			System.out.println("** 2) Exit.                              **");
			System.out.println("*******************************************");
			System.out.println("Selection:");
			input = br.readLine();
			choice = Integer.parseInt(input);
			switch(choice) {
			//Reverse a string
			case 1:
				System.out.println("Please enter a string:");
				String userInput = br.readLine();
				//To be implemented... reverse a string algo
				break;
			case 2:
				System.out.println("Exiting...");
				System.exit(0);
				}
			}
		}		
		catch (Exception e) {
			System.out.println("Input error has occured, please restart the program.");
		}
	}
}
