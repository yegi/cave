package cave;
import java.util.Scanner;


public class _06ScannerUserInput {

	public static void main(String[] args) {
		
		
		System.out.println("I'm going to use Scanner class for user's input");
		System.out.println("ctrl+shift+o - eclipse will add all neccessary imports.");
		
		Scanner value; //Scanner class - variable that can refer to an object of type Scanner.
		value = new Scanner(System.in); //I'm creating new Scanner object and I'm passing standard, pre-defined System.in - Input stream object.
		
		System.out.println("Enter a line of text: ");
		String line = value.nextLine();
		
		System.out.println("You've entered: " +line);
		
/*//Create Scanner object:
 * Scanner input = new Scanner(System.in)
 * Output the prompt
 * System.out.println("Enter a line of text ");
 
 
 // Wait for user to enter a line of text
 * 
 * String txt = input.nextLine();
 * 
 * 
 * System.out.println("You've entered: " +line);
 *
 * 
 */
		System.out.println("Enter an Int: ");
		int myInt = value.nextInt();
		System.out.println("You've entered this number: " +myInt);
		
		
		System.out.println("Enter Pi number: ");
		double myPi = value.nextDouble();
		System.out.println("Pi = " +myPi);
		
		System.out.println("For more about Scanner Java - google it. Scanner has a method to make the program more robust. ");
		
	}

}
