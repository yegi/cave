package cave;

import java.util.Scanner;

public class _08Switch {

	public static void main(String[] args) {
		// Switch allows you to take different actions, depending of the value of the
		// variable
		// switch - keyword

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start": //case must use constants - you cant check variable here.
			System.out.println("Machine started.");
			break;
		case "stop":
			System.out.println("Machine stopped.");
			break;

		default:
			System.out.println("Unknown command");

		}

	}

}
