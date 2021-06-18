package cave;

class CzyToTy	 { //nazwy klas w obrębie projektów nie mogą się powtarzać - to daje konflikty.

	String name;
	int age;

	void speak() {
		System.out.println("My name is " + name);
	}

	int calculateYearsToRetirement() {

		int yearsLeft = 65 - age;

		return yearsLeft;
	}
	
	int dajWiek() {
		return age;
	}
	
	
	String dajImie() { //so getter returns only the valiue of variable defined somewhere inside the class
				return name;
		
	}
	

}

public class _14GettersAndReturnValues {
	//getter wyciąga dane z klasy i "returnuje" gdzie indziej (main  method)
	

	public static void main(String[] args) {

	CzyToTy Jedynka = new CzyToTy();
	Jedynka.name = "Janek"; //to avoid one class accessing data from other class - encapsulation
							//using keywords private or protected
	Jedynka.age = 44;
	Jedynka.speak();
	int years = Jedynka.calculateYearsToRetirement();
	System.out.println("Till retirement: " +years);
	int wiek = Jedynka.dajWiek();
	String imie = Jedynka.dajImie();
	System.out.println(imie);
	System.out.println(wiek);
	
	
	
	
	
	
	
	}

}
