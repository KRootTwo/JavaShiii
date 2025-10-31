package q08;

//(b) Without using third temporary variable:

public class Q08b {
	public static void main (String [] args) {
		int a = 10 ;
		int b = 5 ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = a + b ;
		b = a - b ;
		a = a - b ;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
