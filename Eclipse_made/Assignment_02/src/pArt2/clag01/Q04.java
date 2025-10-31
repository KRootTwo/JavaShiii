package clag01;
//import java.math.*;

//Write a Java Program that takes a double value t from the command-line and prints
//the value of cos (5t) + sin (7t).

public class Q04 {
	public static void main (String [] args) {
		
		if (args.length != 1) {
			System.out.println("Only One Value BLUD!!!!");
			return;
		}
		
		double t = Double.parseDouble(args[0]);
		
		System.out.println("Entered Value(s): " + t);
		
		double siuuu = Math.cos(5*t) + Math.sin(7*t) ;
		
		System.out.println("The value of cos (5t) + sin (7t) = " + siuuu);
		
		
		
	}
}
