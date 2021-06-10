package cave;

class Person {
	/*Classes can contain:
	 * 1. Data that represent state of an object (in my case, it's my height, name, address, heart rate, etc)
	 * 2. subroutines (methods) (eg main)
	 */
	//we call data in the class: instance variables (data, or "state")
	//data that you want to attach to an object
	 String name;
	 int age;
	 boolean alive;
	
	
}


class Animal {
	int legs;
	String name;
	int weigth;
	int heigth;
	String color;
	
	
	
	
	
}



public class _12Classes { //there can be only one public class
							//if the class is public then it needs to match java filename
	

	public static void main(String[] args) {
		 
		
		
		


			
				String pierwszy = "There may be only one public class";
				String drugi = "but as many non-public as I like";
				
				System.out.println(pierwszy);
				System.out.println(drugi);
				
				Person Andrzej = new Person();
				Andrzej.name = "Andrzej Kwiatkowski";
				Andrzej.age = 38;
				
				Person Michal = new Person();
				Michal.name = "Michal Jarlaczyk";
				Michal.age = 39;
				Michal.alive = true;
				System.out.println("Is Michal alive?: " +Michal.alive);
				
				
	Animal zwierze = new Animal();
	zwierze.legs = 4;
			zwierze.name = "Dog";
			zwierze.weigth = 33;
			zwierze.heigth = 1;
			zwierze.color = "red";

			}

		}


	


