package cave;
import java.util.Scanner;


public class _09Arrays {
	
	public static void main(String[] args)
	{
		System.out.println("Really important distinction between value types and reference types");
		
		System.out.println("int (primitive type) - create enough memory to hold an integer (32 bit)");
		System.out.println("int value = 7 - means put some value into this box");
		
		System.out.println("I can create a variable that can refer to a whole list of integers");
		System.out.println("It's called an array int[] values;");
		System.out.println("This doesn't hold any integers - it can refer to a list of integers");
		System.out.println("So it's not creating a box, but rather creating a label. ");
		System.out.println("So this is reference type/variable");
		System.out.println("I want to allocate some memory which i can put some integers into");
		System.out.println("values = new int[3];"); 
		System.out.println("so what's going on above?");
		System.out.println("It means point 'values' reference at this stuff and this stuff uses new keyword to allocate some memory");
		System.out.println("and the amount I'm allocating is enough to hold 3 integers");
		System.out.println("i'm not referring to any value");
		int[] values;
		values = new int[3];
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		System.out.println("Java is nice enough to add default value to variables in array");
		values[1] = 30;
		System.out.println("Values[1] - set value thirty: " +values[1]);
		
		System.out.println("Let's iterate through the array");
		
		int numbers[] = {5,6,7};
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = numbers[i]*7;
		System.out.println(numbers[i]);
		}
		
	}

}
