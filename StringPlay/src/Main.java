import java.io.*;

public class Main {
	public static void main (String [] args) {
		int choice = 0;
		String input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
			input = br.readLine();
			choice = Integer.parseInt(input);
			System.out.println(choice);
			}
		}		
		catch (Exception e) {
			System.out.println("Input error has occured, please restart the program.");
		}
	}
}
