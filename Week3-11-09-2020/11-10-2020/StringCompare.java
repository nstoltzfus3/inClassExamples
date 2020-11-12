package helloWorld;

public class StringCompare {

	public static void main(String[] args) {
		String a = new String("Hello Worldo!"); // input.nextLine()
		String b = "Hello Worldo!";
		
		System.out.println("Are the MA equal? " + (a == b));
		System.out.println("Are the values equal? " 
				+ (a.equals(b)));
	}
}
