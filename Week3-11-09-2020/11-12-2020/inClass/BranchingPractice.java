package helloWorld;

import java.util.*;


public class BranchingPractice {
	public static void main(String[] args) {
		
		// generate a random number between 0 and 100
		Random random = new Random();
		int breakAt = random.nextInt(100);
		 
		// print a 'list' of random length
		for(int i=0; i<100; i++)
		{
		    if ( i==breakAt)
		    {
		        System.out.println("Random number was: " + breakAt);
		        continue;
		    }
		    // if number is even, skip to next iteration
//		    if ( i%2==0)
//		    {
//		        continue;
//		    }
		    System.out.println("Index: " + i);
		}
		System.out.println("After the loop");
		
		
		// the snippet would print 5 'lists', each with the numbers 0-12 in them.
		
		outer : for(int i=0; i<5; i++)
		{
		    System.out.println("List number: " + i);
		    inner : for(int y=0; y<25; y++)
		    {
		        System.out.println("Index: " + y);
		        if ( y == 12)
		        {
		            continue outer;
		        }
		        
		        if ( y == 8)
		        {
		            continue inner;
		        }
		    }
		}
	}
}
