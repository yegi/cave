package cave;

class Frog {
	private String name;// = "Stefan";
	private int age = 14; // use private to enforce encapsulation

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	void opowiadam(String namep, int agep) {
		System.out.println("Mam na imie: " + namep + " oraz mam " + agep + " lat.");

	}

	/*
	 * public void setName(String newName) { name = newName; //i'm setting instance
	 * variable name equal to newName }
	 */

	public void setName(String name) { ////method parameter newName is different than instance variable otherwise we would have 2 the same variable names in the same scope
		this.name = name;	//after changeing newName to name i'll have 2 names in the same scope
		// without any prefix name will be chosen the closest one (so in this case parameter)
		//to refer to instance variable i need to use this keyword
	}

	public void setAge(int age) {
		this.age = age; //this is actually a reference to an object i'm in
	}
	
	
	
	
	public void setInfo(String name, int age) {
	setName(name); //no need to use this here - it's only to avoid ambituity like this.name = name;
	setAge(age);
	}
	}



public class _16SettersAndThis {
	public static void main(String[] args) {

		Frog zaba = new Frog();
		//zaba.name = "Andrzej"; // we need to know what are variables in class to get and set value directly
		//zaba.age = 53; // and that's not desireable in more complex situations
		// to avoid this we want to use get methods and set methods
		// thanks to this we don't have to worry about class's internal variables.
		// so instead of setting instance variables using equal sign
		// it's better to call a method to set the value.
		// this is called encapsulation - it's enough to add keyword private to each
		// variable
		// and i won't be able to access variables outside the class

		//System.out.println("Żaba ma na imię: " + zaba.name + " oraz ma " + zaba.age + " lat.");

		String imie = "Janeczek";
		int wiek = 33;
		zaba.setAge(wiek);
		zaba.setName(imie);

		int wiekNowy = zaba.getAge();
		String imieNowe = zaba.getName();
		System.out.println(zaba.getName());
		zaba.setName("Robert");
		imieNowe = zaba.getName();
		System.out.println(zaba.getName());
		zaba.opowiadam(imieNowe, wiekNowy);

	}

}
