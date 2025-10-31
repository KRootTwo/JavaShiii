package q08;

//Write a Java Program to exchange the values of two variables of integer type A
//and B.
//(a) Using third temporary variable C.

public class Q08a {
	public static void main (String [] args) {
		int a = 10 ;
		int b = 5 ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int c = a ;
		a = b ;
		b = c ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		
	}
}
