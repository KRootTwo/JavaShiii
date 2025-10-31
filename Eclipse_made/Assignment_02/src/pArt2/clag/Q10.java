package clag;

//Write a Java Program that prints five uniform random values between 0 and 1, their 
//average value, and their minimum and maximum value.  
// 
//Note: Use Math.random(), Math.min(), and Math.max(). Don’t use any loop

public class Q10 {
	public static void main (String [] args) {
		
		double a = Math.random();
		System.out.println (a);
		double b = Math.random();
		System.out.println (b);
		double c = Math.random();
		System.out.println (c);
		double d = Math.random();
		System.out.println (d);
		double e = Math.random();
		System.out.println (e);
		
		double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
		double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		double avg = (a+b+c+d+e)/5 ;
		
		System.out.println("Max Value: "+ max);
		System.out.println("Min Value: "+ min);
		System.out.println("Avg Value: "+ avg);
		
	}
}
