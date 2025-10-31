package aSs2;
import java.util.*;
import java.math.*;

public class Q07 {
	
	static int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	public static void main (String [] args) {
		int a = 1 ;
		int b = 2 ;
		
		System.out.println("a" + "\t" + "b" + "    " + "pow(a,b)");
		System.out.println(a + "\t" + b + "\t" + pow(a++, b++));
		System.out.println(a + "\t" + b + "\t" + pow(a++, b++));
		System.out.println(a + "\t" + b + "\t" + pow(a++, b++));
		System.out.println(a + "\t" + b + "\t" + pow(a++, b++));
		System.out.println(a + "\t" + b + "\t" + pow(a++, b++));
		}
	
}
