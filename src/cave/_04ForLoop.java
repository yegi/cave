package cave;

public class _04ForLoop {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { // for(first section contains code that executes before the loop starts, i can
										// initialize a counter here
										// second section/clause - is condition - as long as it's true - the loop will
										// execute - IT'S CHECKED BEFORE EVERY ITERATION
										// third section contains code, that executes AFTER EVERY iteration of the loop
			System.out.printf("The value of i is %d\n", i); // printf is a method that requires 2 parameters - 1st is
															// string - format specifier, 2nd one - is the value
															// the format specifier begins with % and a letter - for int
															// it's d
															// \n - return of the carriage - new line
			System.out.println("The value os i is " + i);
			/*
			 * for(;;) {
			 * 
			 * }
			 */

		}
	}

}
