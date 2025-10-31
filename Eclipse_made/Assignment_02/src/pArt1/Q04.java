package aSs2;
import java.util.*;
import java.math.*;

//Write a Java Program that prompts the user to enter the side of a hexagon and displays
//its area.
//Formula:
//Area of a hexagon is = 3√3/2 *(side)^2

public class Q04 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter one side of the hexagon: ");
		double sd = blehh.nextDouble();
		
		double area = (3.0/2) * Math.sqrt(3.0) * Math.pow(sd, 2.0);
		
		System.out.println("The area of the hexagon = " + area);
		
	}
}
