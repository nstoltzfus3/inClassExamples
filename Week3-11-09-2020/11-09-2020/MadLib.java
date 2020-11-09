import java.util.Scanner;

public class MadLib {
	
	public static int getANumber() {
		return 10;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Name please:");
    	String name = input.nextLine();
    	System.out.println("Adjective please:");
    	String adjective = input.nextLine();
    	System.out.println("noun please:");
    	String noun = input.nextLine();
    	System.out.println("noun2 please:");
    	String noun2 = input.nextLine();
    	System.out.println("number please:");
    	String number = input.nextLine();
    	System.out.println("yourName please:");
    	String yourName = input.nextLine();
    	
    	System.out.printf("Dear %s,\nYou are %s"
    			+ " and I want to be your %s! "
    			+ "I want to go to the %s with you in "
    			+ "%s days.\nSincerely, %s", name, 
    			adjective, noun, noun2, number, yourName);
    	
    	System.out.print(getANumber());
	}
}

