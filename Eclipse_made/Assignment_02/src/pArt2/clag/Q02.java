package clag;
//import java.math.*;

public class Q02 {
	public static void main (String [] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Entered Value(s): \n" + a +"\t" + b);
		
		double siuuu = Math.pow(a, b);
		
		System.out.println(a + " to the power " + b + " = " + siuuu);
		
	}
}
