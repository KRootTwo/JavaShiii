package clag01;
//import java.util.*;

//Write a Java Program that takes two positive integers from command-line
//arguments and prints the result of first number raise to the power of second number.
//Note: Use Math.pow( )

public class Q02 {
	static double blehh(int x, int y) {
		double res = Math.pow(x, y);
		return res ;
	}
	public static void main (String [] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Entered Value(s): \n" + a +"\t" + b);
		
		double siuuu = blehh(a, b);
		
		System.out.println(a + " to the power " + b + " = " + siuuu);
		
	}
}
