package cave;

import java.util.Scanner;

public class _07DoWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number");
/*
		int value = input.nextInt();
		while (value != 5) {
			System.out.println("You've entered " + value);
			System.out.println("Enter a number");
			value = input.nextInt();
		}

		System.out.println("You've entered 5!");
*/
		
		//the same as above using do while loop
		
		int value;
		do {
	//		int value = scanner.nextInt(); //Variable Scope - when you declare a variable - that variable only exists within curly brackets in which it is declared 
			System.out.println("Enter a number. 5 - exit the program: ");
			value = input.nextInt();
			System.out.println("You've entered: " +value);
			
		}while(value != 5); //as long as this condition is true - it'll run and run and run
		//Variable scope - if int would be declared inside the loop, this condition couldn't be checked and return an error
		System.out.println("You've entered 5!");
	}

}
