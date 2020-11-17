package petHomework;

public class JavaCalculator {
	public double add(double a, double b) {
		return (double)a+b;
	}
	
	public double subtraction(double a, double b) {
		return (double)a-b;
	}
	
	public double multiplication(double a, double b) {
		return (double)a*b;
	}
	
	public static double division(double a, double b) { // a = 5, b = 10, 0.5
		return (double)a/b;
	}
	
	public double square(double a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		System.out.print(division(2,0));
	}
}
