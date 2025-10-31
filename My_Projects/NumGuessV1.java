import java.util.*;
// import java.math.*;

public class NumGuessV1 {
    public static void main(String[] args) {
        Scanner blehh = new Scanner(System.in);
        
        int gn = (int) ((Math.random()*9)+1);
        int guessCounter = 0 ;
        int g = -1 ;

        while (g != gn) {
            System.out.println("Enter a number: ");
            g = blehh.nextInt();
            guessCounter++ ;

            if (g == gn) {
                System.out.println("siuuuuu");
                System.out.println("Guesses = " +guessCounter);
            } else if (g > gn) {
                System.out.println("Too high Nigga.");
            } else if (g < gn) {
                System.out.println("Too low Nigga.");
            }  else {
                System.out.println("WRONG Nigga. TRYY AGAIN.");
            }
        }
        blehh.close();
    }
}