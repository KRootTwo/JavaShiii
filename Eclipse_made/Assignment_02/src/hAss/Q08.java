package hAss;
import java.util.*;
import java.math.*;

//If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This
//is essentially the definition of the / and % operators for integers.)
//Write a Java Program that asks the user how many eggs she has and then tells the user
//how many dozen eggs she has and how many extra eggs are left over.
//A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user
//how many gross, how many dozen, and how many left over eggs she has.

public class Q08 {
	public static void main (String args []) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("How many Eggs: ");
		int egg = blehh.nextInt();
		
		int gros = (egg/144) ;
		int reg = (egg%144);
		int doz = (reg/12);
		int regg = (reg%12);
		
		System.out.println("Total number of eggs is " + gros + " gross, " 
		+ doz + " dozen, and " + regg + " eggs.");
		
	}
}
