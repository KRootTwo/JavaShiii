package clag01;
//import java.math.*;

//Write a Java Program that takes three int values from the command line and prints
//them in ascending order.
//Note: Use Math.min() and Math.max().

public class Q06 {
	public static void main (String [] args) {

		if (args.length > 3) {
			System.out.println("Only put 3 integers Dawg.");
			return;
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("Entered Value(s): " + a +"\t" + b + "\t" + c);
		
		int mx = Math.min(a, Math.min(b, c));
		int mn = Math.max(a, Math.max(b, c));
		int md = ((a + b + c) - (mx + mn)) ;
		
		System.out.println("\nAscending Order: " + mn +"\t" + md + "\t" + mx);
				
				
		
		
	}
}
