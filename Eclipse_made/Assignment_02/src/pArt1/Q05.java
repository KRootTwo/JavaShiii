package aSs2;
import java.util.*;
import java.math.*;
//
//Write a Java Program that prompts the user to enter two points (x1, y1) and (x2, y2)
//and displays their distance between them.
//Formula:
//distance = √(𝒙𝟐 − 𝒙𝟏)𝟐 + (𝒚𝟐 − 𝒚𝟏)𝟐
//Note:
//Use Math.pow (a, 0.5) to compute √𝑎

public class Q05 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		
		System.out.print("Enter the co-ordinates of the first point: ");
		double x1 = blehh.nextDouble();
		double y1 = blehh.nextDouble();
		System.out.print("Enter the co-ordinates of the second point: ");
		double x2 = blehh.nextDouble();
		double y2 = blehh.nextDouble();
		
		double dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("The distance between the two points = " + dist);
		
	}
}
