package clag;

public class Q05 {
	public static void main (String [] args) {
		
		if (args.length > 3) {
			System.out.println("Only put 3 integers Dawg.");
			return;
		}
		
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		
		boolean siuuu = (a<b && b<c) || (a>b && b>c);
		
		System.out.println("Strict order check: ---> " + siuuu);
		
	}
}
