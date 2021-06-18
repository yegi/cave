package cave;

class Machine {
//constructor is a special method which is run everytime i create an instance of my class
	//method must have return type even if it's void
	//constructor doesn't have to have it
	//it has to have the same name as your class
	public Machine() {
		System.out.println("Constructor running");
}//everytime i create an object - constructor is started
//very oft we use constructors for initialization of instance variables
}


class Breast {
	private String tits;
	
	public Breast() {
		tits = "Cycki"; //i'm using constructor to set default value
	System.out.println("First constructor");
	}
	
/* it is possible to have multiple constructors
 * as method can get parameters
 * so constructor can get them too
 * as long as we have different parameter/constructor it's ok	
 */
	
	public Breast(String tits) {
	System.out.println("Second constrcutor");
	this.tits = tits;
	System.out.println(tits);
	
	
	
	}
	
	}
	
	





public class _17Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Machine maszyhnka = new Machine();
		//constructor runs everytime an object is created;
		
		new Machine(); //this itself is going to start a constructor
		new Machine("Cycuszki");
		
		
	}

}
