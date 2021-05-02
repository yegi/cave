package cave;

public class _01Variables {

	public static void main(String[] args) {
	//Variables are like boxes, you can put value in
		//for different kind of variables you need different type of boxes
		
		
		System.out.println("There are 8 primitive types of variables in JAVA.");
		
		//in 2^32 - from -32k to 32k 
		int myInt; //declaration of variable
		myInt = 32000; //initialization of variable
		
		int myInt2 = -32000; //but you can declare a variable and initialize at once/at the same time - that's the same thing!
		
		System.out.println("First - Int - 32 bit value " +myInt+" "+myInt2);
		
		
		short myShort = 847;	//16 bits value
		
		System.out.println("Second - Short 16 bits value " +myShort);
		
		long myLong = 1234567890; //64 bit value

		System.out.println("Third - Long - 64 bits value " +myLong);
		
		double myDoublePi = 3.14159;//double/extra precision variable
		
		System.out.println("Fourth - Double (Pi) " +myDoublePi);
		
		float myFloatPi = 3.14f; //In float there is a catch - you need to use 'f' letter at the end of the float number
		
		System.out.println("Fifth - Float " +myFloatPi);
		
		
		char myChar = '&';//can hold a Unicode character
		
		System.out.println("Sixth - Char can hold a unicode character (i.e. ampersand): " +myChar);
		
		boolean myBool = true; //bool logic - true/false values only
		
		System.out.println("Seventh - This is a bool, isn't it? " +myBool);				

		byte myByte = 127; //8 bits (1byte) value
		System.out.println("Eight - byte - holds 8 bits value " +myByte);
		
		System.out.println("Doubles and Ints are the most common used values");
	}

}
