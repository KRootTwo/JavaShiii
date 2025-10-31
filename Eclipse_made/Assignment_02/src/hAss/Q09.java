package hAss;
import java.util.*;
import java.math.*;

// Write a Java Program that reads an integer between 0 and 1000 and adds all the digits
//in the integer.

public class Q09 {
	public static void main (String [] args ) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter yo number: ");
		int k = blehh.nextInt();
		
		int d1 = k % 10 ;    // 3
		k = k/10 ;           // 12
		int d2 = k % 10 ;    // 2
		k = k/10 ;           // 1
		int d3 = k % 10 ;    // 1
		
//		System.out.println(d1  + " " + d2 + " " + d3);
		System.out.println("The sum of the digits are: " + (d1 + d2 + d3));
	}
}
