package cave;

class Machine {
//constructor is a special method which is run everytime i create an instance of my class
	// method must have return type even if it's void
	// constructor doesn't have to have it
	// it has to have the same name as your class
	public Machine() {
		System.out.println("Constructor running");
	}// everytime i create an object - constructor is started
//very oft we use constructors for initialization of instance variables
}

class Breast {
	private String tits; // ------------------------------------------- INSTANCE VARIABLE

	public Breast() {

		tits = "Cycki"; // i'm using constructor to set default value
		System.out.println("First constructor");
	}

	/*
	 * it is possible to have multiple constructors as method can get parameters so
	 * constructor can get them too as long as we have different
	 * parameter/constructor it's ok
	 */

	public Breast(String tits) { // ----------------------------------------LOCAL VARIABLE
		System.out.println("Second constrcutor");
		this.tits = tits; // this.tits instance variable; tits = local variable
		System.out.println(tits);

	}

	public Breast(int number, String name) {
		System.out.println("Third constructor - it's using 2 parameters");
		System.out.println(number + name);
	}

}


class Constructions {
//sometimes i wanna call a constructor from within another constructor. 
//one possibility is that: all the more complex constructors could call the simpler ones
// for example: some kind of initialization that i want always run
//use most 

	public Constructions() {
		this("Second, more complex");
		System.out.println("First/simple constructor");
	}
	
	
	public Constructions(String complex) {
		this("Third","The most complex"); //this is used to call the constructor - this just means call the constructor. Calling constructor without parameters is this()
		// call to a constructor needs to be the first line!! Consctructor cannot call itself, cause it'll be infinite loop
		System.out.println("Second/More Complex constructor");
	}
	
	public Constructions(String advanced, String expert) {
		System.out.println("Third/the most complex constructor");
	}
	
	
	
	
}






public class _17Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine maszynka = new Machine();
		// constructor runs everytime an object is created;

		new Machine(); // this itself is going to start a constructor
		Breast cycki = new Breast();
		new Breast("Cycuszki");
		new Breast(2, "Cycki");

		Constructions konstrukcja = new Constructions();
		
		
		
	}

}
