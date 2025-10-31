package aSs2;
import java.util.*;
import java.math.*;

//Enter the basic salary of an employee of an organization through the keyboard. His
//dearness allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is
//20% of basic salary. Write a Java Program to calculate his gross salary. Print the DA,
//HRA and Gross salary.

public class Q03 {
	public static void main (String [] args) {
		Scanner blehh = new Scanner(System.in);
		System.out.print("Enter yo salary foo: ");
		float sal = blehh.nextFloat();
		
		float da = (float) (sal * (40.0/100));
		float hra = (float) (sal * (20.0/100));
		float grsal = (float) (sal + da + hra );
		
		System.out.println("Your DA is = " + da);
		System.out.println("Your HRA is = " + hra);
		System.out.println("Your Gross Salary is: " + grsal + " mate");
		
		
	}
}
