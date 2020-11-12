package helloWorld;

public class ConditionalPractice {

	public static void main(String[] args) {
		int a = 90;
		int b = 2^31 - 1;	
		
		if (a == 10) { // true
			System.out.print("A is 10.");
		} else if (a < 10 && a > 5) {
			System.out.print("A is < 10.");
		} else if (a > 10) {
			System.out.print("A is > 10.");
		} else { // !== ===  ->>>  != ==
			System.out.print("A != to 10."); // != is not equals
		}
	}
}
