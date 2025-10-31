package aSs2;
import java.util.*;
import java.math.*;

// public static void main (String [] args ) {}
// System.out.println("");
public class Q01 {
	public static void main (String [] args) {
		Scanner siuuu = new Scanner(System.in);
		System.out.print("Enter temperature in celcius: ");
		double cel = siuuu.nextDouble();
		System.out.println(cel);
		
		double fweh = (((9.0/5)*cel)+32) ;
		
		System.out.println("The temperature in farenheit is = " + fweh);
	}
}
