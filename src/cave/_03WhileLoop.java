package cave;

public class _03WhileLoop {
	public static void main(String[] args) {
		System.out.println("Press ctrl+Shift+f - everything will be perfectly formatted.");

		boolean loop = true;
		boolean loop1 = 4 < 5;
		boolean loop2 = 6 < 2;

		System.out.println(loop);
		System.out.println(loop1);
		System.out.println(loop2);
		int value = 10;
		boolean loop3 = value < 20;
		System.out.println(loop3);

		int condition = 0;
		
		while(condition < 30) //while(condition) as long as condition = true, the loop will run
		{
			System.out.println("Hello " +condition);
			
			condition = condition + 1;
		}
		
		
		/*
		while(condition)
		{
			
		}
		*/
		
		
	}

}
