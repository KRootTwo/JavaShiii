package q05;

//Write a Java program to initialize the variable radius of the circle, compute the
//perimeter and area of the circle. [Use Math.PI]
//(Assume radius, perimeter, area as double type variable.)

import java.math.*;

public class Q05 {
	public static void main (String [] args) {
		double rad = 15.5;
		
		double peri = 2*Math.PI*rad;
		
		System.out.println(peri);
	}
}
