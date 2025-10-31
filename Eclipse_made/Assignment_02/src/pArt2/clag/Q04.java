package clag;
//import java.math.*;

//Write a Java Program that takes a double value t from the command-line and prints 
//the value of cos (5t) + sin (7t).  

public class Q04 {
	public static void main (String [] args) {
		
		double a = Double.parseDouble(args[0]);
//		double b = Double.parseDouble(args[1]);
		
		double ca =( Math.cos(5*a) + Math.sin(7*a) );
		
		System.out.println("The value of cos (5t) + sin (7t) = " + ca);
	}
}
