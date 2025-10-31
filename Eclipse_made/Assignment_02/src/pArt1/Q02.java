package aSs2;
import java.util.*;
import java.math.*;

public class Q02 {
	public static void main (String [] args) {
		Scanner bot = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius = bot.nextDouble();
		double length = bot.nextDouble();
		
//		System.out.print("Enter radius = ");
//		double radius = bot.nextDouble();
//		System.out.print("Enter length = ");
//		double length = bot.nextDouble();
//		
//		double area1 = Math.PI * rad * rad;
		double area2= Math.PI * Math.pow(radius, 2);
		double vol = area2*length;
		
		System.out.println("The area is = "+area2);
		System.out.println("The volume is = "+vol);
	}
}
