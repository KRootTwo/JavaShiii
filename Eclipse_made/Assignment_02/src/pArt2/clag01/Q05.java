package clag01;

//Write a Java Program that takes three floating point values x, y, and z as command-
//line arguments and prints true if the values are strictly ascending or descending (x <
//y < z or x > y > z), and false otherwise.

public class Q05 {
	public static void main (String [] args) {
		
		if (args.length > 3) {
			System.out.println("Only put 3 integers Dawg.");
			return;
		}
		
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		
		System.out.println("Entered Value(s): " + a +"\t" + b + "\t" + c);
		
		if (a > b && b > c ) {
			System.out.println("Strict Order (Descending) Check "+ a +" " + b + " " + c +" "+ "----> true");
		} else if (a < b && b < c) {
			System.out.println("Strict Order (Ascending) Check "+ a +" " + b + " " + c +" "+ "----> true");
		} else {
			System.out.println("Strict Order Check "+ a +" " + b + " " + c +" "+ "----> false");
		}
		
		
//		if (a > b && b > c ) {
//			System.out.println("The values are in strictly Descending order");
//		} else if (a < b && b < c) {
//			System.out.println("The values are in strictly Ascending order");
//		} else {
//			System.out.println("The values are in neither strictly Ascending or Descending order");
//		}
//		 
		 
		 
	}
}
