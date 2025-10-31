package clag;

//Write a Java Program that takes three positive integers from command-line 
//arguments and prints true if any one of them is less than or equal to the product of the 
//other two and false otherwise. 

public class Q08 {
	public static void main (String [] args) {
		
		if (args.length > 3) {
			System.out.println("ONLYYYY THREEEEE NIGGERRRR");
			return;
		}
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		
		boolean d = (x*y >= z)&&(y*z >= x)&&(z*x >= y);
		System.out.println("Product check "+x+" "+y+" "+z+" ---> "+d);
		
		
		
		
	}
}
