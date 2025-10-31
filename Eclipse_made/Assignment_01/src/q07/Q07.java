package q07;

//What do each of the following print?
//System.out.println('A' + 1);
//System.out.println("A" + 1);
//System.out.println((char)('A' + 1));
//System.out.println('1' + 1);
//System.out.println("1" + 1);

public class Q07 {
	public static void main (String [] args) {
		System.out.println('A' + 1);             //66
		System.out.println("A" + 1);             //A1
		System.out.println((char)('A' + 1));     //B
		System.out.println('1' + 1);             //49+1=50
		System.out.println("1" + 1);             //11
	}
}
