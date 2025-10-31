package aSs2;
import java.util.*;
import java.math.*;

//Write a Java Program that prompts the user to enter three points (x1, y1), (x2, y2),
//(x3, y3) of a triangle and displays its area.
//Formula:
//s = (side1 + side2 + side3)/2;
//area=√(𝑠 ∗ (𝑠 − 𝑎) ∗ (𝑠 − 𝑏) ∗ (𝑠 − 𝑐))

public class Q06 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		
		System.out.print("Enter the co-ordinates of the first point: ");
		double x1 = blehh.nextDouble();
		double y1 = blehh.nextDouble();
		System.out.print("Enter the co-ordinates of the second point: ");
		double x2 = blehh.nextDouble();
		double y2 = blehh.nextDouble();		
		System.out.print("Enter the co-ordinates of the third point: ");
		double x3 = blehh.nextDouble();
		double y3 = blehh.nextDouble();		
		
		double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
		double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		double s = (a + b + c)/2.0 ;
		
		double area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
		
		System.out.println("The area of the triangle is = ");
	}
}
