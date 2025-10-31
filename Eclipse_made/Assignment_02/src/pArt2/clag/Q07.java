package clag;

//Write a Java Program that prints the sum of two random integers between 1 and 6 
//(such as you might get when rolling dice). 
// 
//Note: Use Math.random( ) 

public class Q07 {
	public static void main (String [] args) {
		int a = (int) ((Math.random()*6) +1);
		int b = (int) ((Math.random()*6) +1);
		
		System.out.println (a);
		System.out.println (b);
		
		System.out.println ("Sum of two dies are " + (int) (a+b));
	}
}
