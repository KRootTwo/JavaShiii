package hAss;
import java.util.*;
import java.math.*;

//The distance between two cities (in km.) is input through the keyboard. Write a Java
//Program to convert and print this distance in meters, feet, inches and centimetres.
//Hint: 1km=1000 meter, 1km=3280.8399 feet, 1km= 39370.0787 inch, 1km= 100000
//centimetre

public class Q10 {
	public static void main (String args []) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("How much distance(in km): ");
		int dis = blehh.nextInt();
		
		double met = dis * 1000 ;
		double fet = dis * 3280.8399 ;
		double inc = dis * 39370.0787 ;
		double cem = dis * 100000 ;
		
		System.out.println("The distance in meters is: " + met);
		System.out.println("The distance in feets is: " + fet);
		System.out.println("The distance in inches is: " + inc);
		System.out.println("The distance in centimeters is: " + cem);
		
	}
}
