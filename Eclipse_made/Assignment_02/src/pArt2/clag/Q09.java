package clag;

//Write a Java Program to input a four-digit number from command-line argument 
//and find sum of the first and last digit of the number.

public class Q09 {
	public static void main (String [] args) {
		 
		int x = Integer.parseInt(args[0]);
		
		int a = x/1000 ;
		int b = x%10;
		
//		System.out.println(a+" "+b);
		System.out.println("Sum of the first & last digit is = " +(a+b));
		
		
	}
}
