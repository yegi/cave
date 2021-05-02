package cave;

public class _05IfConditionalStatement {

	public static void main(String[] args) {

		boolean condition1 = 1 > 6;
		System.out.println(condition1);

		boolean condition2 = 3 != 8; // is not equal ! means negation
		System.out.println(condition2);

		boolean condition3 = 4 == 5; // = means assigment, or setting, to test for equality we use ==
		System.out.println(condition3);

		if (4 == 4) {
			System.out.println("Can u use ctrl+d to get rid of whole lines?");

			System.out.println("Yes, it's true");
		}

		int myInt = 20;

		if (myInt < 30) {
			System.out.println("True");
		}

		if (myInt > 30) {
			System.out.println("I won't be executed");

		} else {
			System.out.println("But else will be executed");

		}

		if (myInt < 10) { // if this is true
			System.out.println("myInt < 10");

		} else if (myInt > 20) { // this is not gonna happen
			System.out.println("else if myInt > 20");

		} else {
			System.out.println("None of the above");
		}

		int loop = 0;
		while (true) {
			System.out.println("Looping: " + loop);
		
			if (loop == 5) {
				break; //this immediately causes loop stop executing, so it's jump out of the loop
			}
			loop++;
			System.out.println("Running the loop");
		
		}
System.out.println("I'm outside the loop!");
	}

}
