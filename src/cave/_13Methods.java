package cave;

class Phones {
	String name;
	int weigth;
	int yearOfRelease;
	// subroutine/funciton which is a part of a class is called a method

	void funkcja() {
		System.out.println("Lubię dzwonić");
		System.out.println("Dryń, Dryń xD");
		for (int i = 1; i < 40; i++) {
			System.out.println("Wypuścili mnie: " + yearOfRelease + " a ważę: " + weigth);
		}

	}

	void drugaFunkcja() {
		System.out.println("Jestem funkcją nr 2 w klasie");
	}

}

class Duch {
	String name;
	int age;

	// classes can contain
	// 1. data
	// 2. subroutines

	void speak() { // always start with lower case latter until it's constructor - which has name
					// of the class
		for (int i = 0; i <= 3; i++) {
			System.out.println("Hello " + name + " I'm " + age + " old.");
		}

	}

	void sayHello() {
		
		System.out.println("Hello there!");
		
	}



}

public class _13Methods {

	public static void main(String[] args) {

		Phones Pixel = new Phones();
		Pixel.weigth = 560;
		Pixel.yearOfRelease = 2016;
		Pixel.funkcja();
		Pixel.drugaFunkcja();

		Duch Pies = new Duch();
		Pies.speak();
		Duch Kot = new Duch();
		Kot.name = "Mruczek";
		Kot.age = 5;
		Kot.speak();
		Kot.sayHello();
	}
}
