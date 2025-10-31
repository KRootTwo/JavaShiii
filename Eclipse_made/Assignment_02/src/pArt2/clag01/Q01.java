package clag01;
//import java.math.*;

public class Q01 {
	public static void main (String [] args ) {
//		int [] arr1 = new int [6] ;
//		boolean a1 = (args[0] % args[1])== 0 ;
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		int f = Integer.parseInt(args[5]);
		
		System.out.println("Entered Value(s): \n" + a +"\t" + b + "\n" 
		+ c + "\t" + d + "\n" + e + "\t" + f);
		
		boolean a1 = a % b == 0 || b % a == 0 ;
		boolean a2 = c % d == 0 || d % c == 0 ;
		boolean a3 = e % f == 0 || f % e == 0 ;
		
		System.out.println("Evenly Divides " + a + " " + b + " ---> " + a1);
		System.out.println("Evenly Divides " + c + " " + d + " ---> " + a2);
		System.out.println("Evenly Divides " + e + " " + f + " ---> " + a3);
	}
}
