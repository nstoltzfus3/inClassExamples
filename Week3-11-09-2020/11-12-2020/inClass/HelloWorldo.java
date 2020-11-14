package helloWorld;
import java.util.Scanner;
//import java.util.*;


public class HelloWorldo {
	
	/*
	 * function(int input1)
	 * void ~= null, but its for return values.
	 * 
	 * static == theres no context
	 * 
	 * console.log == System.out.println();
	 */
    public static void main(String[] args) {
    	/*
    	 * Constructor - Anytime a new object is made
    	 * 				- generally (all the time in java) uses
    	 * 					the keyword <new>
    	 */
    	
    	Scanner input = new Scanner(System.in); // instance of a class.
    	// loose typing
    	// let a = 10;
    	// let b = "a string";
    	// strict typing
    	// int a = 10;
    	// String b = "a string";
//    	System.out.println("What is your favorite food?");
    	String whatever = input.nextLine();
//    	System.out.println("You said this: " + whatever);
//    	String testString = "This is a test!";
//    	System.out.printf("This is my first input: %s THis is my second input: %s", 
//    						testString, whatever); 
    	// what we want
    	// name, adjective, verbOne, verbTwo, number, yourName
    	

    	// string to print
    	/*
    	 * Dear name,
    	 * You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.  
    	 * Sincerely, yourName
    	 */

    	
//        System.out.print("Hello, World!" + 9 + "asdf \n"); 
//        System.out.print("Hello, World!" + 9 + "asdf \n");
        
        
    }
    
    
}
