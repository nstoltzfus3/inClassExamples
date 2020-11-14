package helloWorld;

public class ReturnPractice {
	
	public static int addNums(int a, int b) {
		return a + b;
	}
	
	 // insert ONLY positive, odd data
	public static void insertOddData(int data)
	{
	    // equal to 0 check
	    if (data == 0)
	    { 
	        return;
	    }
	    // Negative check
	    if (data < 0)
	    {
	        return;
	    }
	    // check to see if data is even or odd
	    if ( data%2 == 0) // even 2%2== 0  6%2==0
	    {
	        return;
	    }
	 
	    // some code here to store the odd data somewhere
	    System.out.println("Odd Data Stored");
	    return;
	}
	 
	// find and return the sum of the array
	public static int getArraySum(int[] arr)
	{
	    // initialize to a valid default return value
	    int sum = 0; // [1,2,3,4,5]
	 
	    // array must have values to sum
	    if (arr.length > 0)
	    {
	        for(int n : arr) // [1,2,3,4,5] // 1,2,3,4,5
	        {
	            sum = sum + n; // 1
	            // sum = 1  // n = 1
	            // sum = 3	// n = 2
	            // sum = 6	// n = 3
	            
	            // sum = 15
	            
	            
	        }
	    }
	 
	    return sum; // 0
	}
	
//	public class Dog {
//		private int speed;
//		
//		Dog (){
//			
//		}
//		
//		public void run() {
//			
//		}
//	}
	
	public static void main(String[] args) {
		 int sum = addNums(2, 3);
		 int[] arr = {1,2,3,4,5};
		 int result = getArraySum(arr);
		 
		 
		 
		 
		 
	}
}
