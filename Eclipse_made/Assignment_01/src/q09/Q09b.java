package q09;

//(b) Without using fourth temporary variable.

public class Q09b {
	public static void main (String [] args) {
		int a = 7 ;
		int b = 8 ;
		int c = 9 ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		System.out.println("c = " + c);
		
		a = a + b + c ;
		b = a - b - c ;
		c = a - b - c ;
		a = a - b - c ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);		
		System.out.println("c = " + c);
		
	}
}
