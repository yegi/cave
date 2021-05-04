package cave;

public class _10StringArrays {

	public static void main(String[] args) {

		String[] texts = new String[5]; // I'm allocating enough memor for 3 references to strings
		texts[0] = "Hello ";
		texts[1] = "to ";
		texts[2] = "you!";

		System.out.println(texts[2]);

		String[] fruits = { "apple", "peach", "banana", "kiwi", "plum" };

		for (String owoc : fruits) { // this is how we iterate on arrays
			System.out.println(owoc);

		}
		
	String text; //string is non-primitive type - it's a class. like a visit card with your address - it reserves enough memory for a reference. 
	//by default references are null
	
	text = null;
	System.out.println(text); //this wont start without variable initialization, 
	
	//String[] words = {"one","potato","two","potatoes"};
	String[] words = new String[4];
	
	for (String word: words) {
		System.out.println(word);
	}
	
	
	}

}
