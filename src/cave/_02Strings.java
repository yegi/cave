package cave;

public class _02Strings {
	public static void main(String[] args) {
		System.out.println("1. To autofill main method - use main and ctrl+space"); //this doesn't provide correct indentation 
		System.out.println("Everytime curly bracket {} increases indetation by one.");
		System.out.println("String starts with uppercase S, as it's not a primitive type, but it's a class");
		
		String text = "Hello Strings";
		//concept of objects and classess
		//string is a class - it's a type - e.g. cats doesn't refer to a cat - type of animal
		//string is a type of object, that can hold text
		
		System.out.println(text);
		
		String empty = " ";
		
		String pants = "(Y)";
		
		String fun = text+empty+pants; //concatenate
		
		System.out.println(fun);
		
		System.out.println("I like" + " " +pants +empty + "in the summer");
		
		String number = "5";
		
		int nr = 5;
		
		System.out.println("String + int " +number+nr);
		
		
		double pi = 3.14;
		
		
		System.out.println("Pi = " +pi);
		
	}

}
