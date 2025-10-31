package q09;

//Write a Java Program to exchange the values of two variables of integer type A, B,
//and C.
//(a) Using fourth temporary variable D.

public class Q09a {
	public static void main (String [] args) {
		int a = 7 ;
		int b = 8 ;
		int c = 9 ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		System.out.println("c = " + c);
		
		int d = a ;
		a = c ;
		c = b ;
		b = d ;
		
		System.out.println();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		System.out.println("c = " + c);

	}
}
