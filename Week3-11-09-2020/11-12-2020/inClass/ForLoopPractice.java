package helloWorld;

import java.io.*;
import java.io.FileReader;
import java.util.Scanner;

public class ForLoopPractice {
	
	public static void main(String[] args) {
		String[] stuff = {"Stuff1", "Stuff2"}; // 2
		
		// -->> [] XX
		//                   0         1
		//stuff[]
//		for (int i = 0; i < stuff.length; i++) { // 0, 1
//			System.out.println("stuff here: " + stuff[i]);
//		}
		
//		for (String myStuff : stuff) {
//			System.out.println("stuff here: " + myStuff);
//		}
		
		// while (<condition>)
//		int count = 3;
//		while (count < 2) {
//			System.out.println("stuff here: " + 
//						stuff[count]);
//			count++;
//		}
		
//		do {
//			
//		} while(<condition>)
		
		String ch;
		Scanner myScan = new Scanner(System.in);
		 
		do 
		{
		    // Do some processing, with or without value of ch
		    System.out.print("Enter another char command or q to quit: ");
		    ch = myScan.nextLine();
		    if (ch == "n") {
		    	// move your character north
		    }
		    
		 
		} while (!ch.equals("q"));
		 
//		System.out.println("Quit command entered!");
//		BufferedReader reader = new BufferedReader(
//				new FileReader("./myTextFile.txt"));
//		String line = reader.readLine();
//		while (line != null)
//		{
//		    System.out.println(line);
//		    line = reader.readLine();
//		}
	}
	
}
