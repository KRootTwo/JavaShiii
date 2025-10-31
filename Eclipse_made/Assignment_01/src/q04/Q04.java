package q04;

//Write a Java program to store the following details of a student in variables and
//display them in a formatted sentence:
//• Name (String)
//• Roll Number (int)
//• CGPA (double)
//• Grade (char)

public class Q04 {
	public static void main (String [] args) {
		String name = "Koustav Jana";
		int rollNumber = 15;
		double cgpa = 9.9;
		char grade = 'A';
		
		System.out.println("My name is " + name + "; my roll number is " + rollNumber + ". \nMy CGPA is " + cgpa + ", and I got " + grade + " grade in ICP.");
		
	}
}
