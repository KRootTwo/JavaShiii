package clag01;

//Write a Java Program to input a character from command-line and display the ASCII
//value of the entered character.

public class Q03 {
	public static void main (String [] args) {
		
		if (args.length > 3) {
			System.out.println("Out of Bounds blud. Enter 3 characters only.");
			return;
		}
		
		char a = args[0].charAt(0);
		char b = args[1].charAt(0);
		char c = args[2].charAt(0);
		
		System.out.println("Entered Value(s): \n" + a +"\t" + b + "\n" + c);
		
		System.out.println("The ASCII value of the given character is: " + (int) a );
		System.out.println("The ASCII value of the given character is: " + (int) b );
		System.out.println("The ASCII value of the given character is: " + (int) c );

		
		
	}
}
