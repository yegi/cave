package cave;

class Robot
{
	public void speak(String text) {
		System.out.println(text);
	}
	
	
	public void jump(int heigth) {
		System.out.println("Jumping: " + heigth);
		
	}
	
	public void move(String direction, double distance) { //the right type and the right order
		
		System.out.println("Moving: " +distance +" meters, in direction: " +direction);
		
	}
	
	
}



public class _15MethodParameters {
	
	
	public static void main(String[] args)
	{
		Robot michal = new Robot();
	
		
		michal.speak("Hi, I'm Michal.");
		michal.jump(4);
		michal.move("North-East", 44.2);
		
		String greeting = "Ja pierdykam!";
		michal.speak(greeting);
		
		
	}

}
