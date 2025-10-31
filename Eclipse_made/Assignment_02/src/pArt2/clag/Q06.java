package clag;

//Write a Java Program that takes three int values from the command line and prints 
//them in ascending order.  
// 
//Note: Use Math.min() and Math.max().

public class Q06 {
	public static void main (String [] args) {
		
		if (args.length > 3) {
			System.out.println("Put only 3 numbers Dawg.");
			return;
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		int min = (Math.min(a, Math.min(b, c)));
		int max = (Math.max(a, Math.max(b, c)));
		int mid = (a+b+c) - min - max;
		
		System.out.println("Ascending Order: " + max + " " + mid + " " + min);
		
		
		
	}
}
