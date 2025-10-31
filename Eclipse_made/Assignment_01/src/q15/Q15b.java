package q15;

//Write a Java Program to exchange the value of 4 variables W, G, K, A such that the
//value of W will move to A, A to K, K to G and finally G to W. Exchange using with
//and without using extra variables.

public class Q15b {
	public static void main (String [] args) {
		int w = 10 ;
		int a = 11 ;
		int k = 12 ;
		int g = 13 ;
		
		System.out.println(w);
		System.out.println(a);
		System.out.println(k);
		System.out.println(g);
		
		w = w + a + k + g ;
		a = w - a - k - g ;
		k = w - a - k - g ;
		g = w - a - k - g ;
		w = w - a - k - g ;
		
		
		System.out.println(w);
		System.out.println(a);
		System.out.println(k);
		System.out.println(g);
		
	}
}
