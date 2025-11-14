import java.util.*;

public class Aura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2(a)
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (a % b == 0 || b % a == 0) {
            System.out.println(a + " is divisible by " + b );
        } else {
            System.out.println(a + " is not divisible by " + b );
        }

        // 2(b)
        int a = 3 ;
        int b = 1 ;

        int pow = (int) Math.pow(3, 1) ;

        System.out.println( "A" + "\t" + "B" + "\t" + "pow(A,B)");
        System.out.println( a + "\t" + b + "\t" + (int) Math.pow(a++, b++));
        System.out.println( ++a + "\t" + b + "\t" + (int) Math.pow(a++, b++));
        System.out.println( ++a + "\t" + b + "\t" + (int) Math.pow(a++, b++));
        System.out.println( ++a + "\t" + b + "\t" + (int) Math.pow(a, b));

        // ALT VERSION
        System.out.println( "A" + "\t" + "B" + "\t" + "pow(A,B)");
        System.out.println( (a) + "\t" + b + "\t" + (int) Math.pow(a, b++));
        System.out.println( (a += 2) + "\t" + b + "\t" + (int) Math.pow(a, b++));
        System.out.println( (a += 2) + "\t" + b + "\t" + (int) Math.pow(a, b++));
        System.out.println( (a += 2) + "\t" + b + "\t" + (int) Math.pow(a, b++));

        // 2(c)
        int stu = 90 ;
        int boy = 45 ;

        int grdO = (int) (stu * 0.5) ;
        int grdOboy = 20 ;
        int grdOgrl = (grdO - grdOboy) ;

        System.out.println("Number of girls getting grade 'O' is " + grdOgrl);

        // 3(a)
        System.out.print("Enter no. of units consumed: ");
        int unit = sc.nextInt();
        double cost = 0;

        if (unit <= 50) {
            cost += 50 * 3 ;
        } else if (unit <= 200) {
            cost += 50*3 + (unit - 50)*4.80 ;
        } else if (unit <= 400) {
            cost += 50*3 + 150*4.8 + (unit - 200)*5.8 ;
        } else {
            cost += 50*3 + 150*4.8 + 200*5.8 + (unit - 400)*6.2 ;
        }
        System.out.println("Total cost is mf: "+ cost);

        // 3(b)
        sc.nextLine();
        System.out.print("Do yo want to pay the bill online? type(y/n): ");
        String choice = sc.nextLine().toLowerCase();

        if (choice.equals("y")) {
            cost =cost - (cost*0.3) ;
        } else {
            cost += 0 ;
        }
        System.out.println("Your final cost is :" + cost);

        // 3(c)
        System.out.print("Enter operands: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter an operator[+,-,*,/]: ");
        char ch = sc.next().charAt(0);
        double res = 0;

        switch (ch) {
            case '+' :
                res = a + b ;
                break;
            case '-' :
                res = a - b ;
                break;
            case '*' :
                res = a * b ;
                break;
            case '/' :
                if ( b != 0) {
                    res = (double) a / b ;
                } else {
                    System.out.println("Division by zero not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operand.");
        }
        System.out.println( a + " " + ch + " " + b + " = " + res);

        // 4(a)
        System.out.println("Enter limit: ");
        int n = sc.nextInt();
        int sum = 0, pdt = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i ;
            } else {
                pdt *= i ;
            }
        }
        System.out.println("Addition of even numbers = " + sum);
        System.out.println("Product of odd numbers = " + pdt);

        // leapyear
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // #1
        if (year % 100 == 0) {
            if (year % 400 == 0 && year % 4 == 0) {
                System.out.println("Year is a leapyear.");
            }else {
                System.out.println("Year is not a leap year.");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("Year is a leapyear.");
            } else {
                System.out.println("Year is not a leap year.");
            }
        }

        // #2
        if (year % 400 == 0) {
            System.out.println("Year is a leapyear.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Year is a leapyear.");
        } else {
            System.out.println("Year is not a leapyear");
        }

        // #3
        String output = (year % 100 == 0)? ((year % 400 ==0)? "Year is a leapyear":"Year is not a leapyear")
                : ((year % 4 == 0)? "Year is a leapyear":"Year is not a leapyear");
        System.out.println(output);

        // 2(c)
        System.out.print("Enter days: ");
        int days = sc.nextInt();

        int day = days ;
        int year = day/365 ;
        day -= year*365 ;
        int mon = day/30 ;
        day -= mon*30 ;

        System.out.println(days + " days = " + year + " year(s), " + mon + " months & " + day + " days.");

        // 3(c)
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n % 10 == 7) {
            System.out.println("It's a buzz number.");
        } else if (n % 7 == 0) {
            System.out.println("It's a buzz number.");
        } else {
            System.out.println("It's not a buzz number.");
        }

        // 5(a)
        System.out.println("Enter co-ords: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a == 0 && b == 0) {
            System.out.print("Point is the ORIGIN.");
        }else if (a == 0) {
            System.out.println("Point is on y-axis.");
        } else if (b == 0) {
            System.out.println("Point is on x-axis.");
        } else if (a > 0 && b > 0) {
            System.out.println("Point is in quadrant I");
        } else if (a < 0 && b > 0) {
            System.out.println("Point is in quadrant II");
        } else if (a < 0 && b < 0) {
            System.out.println("Point is in quadrant III");
        } else {
            System.out.println("Point is in quadrant IV");
        }

        // prime
        System.out.print("Entre Numero: ");
        int n = sc.nextInt();
        int m = n;
        int div = 0;

        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                div++;
                break;
            }
        }
        if (div == 0) {
            System.out.println("Numero De Primo.");
        } else {
            System.out.println("Numero Nigger.");
        }

        // perfect number
        System.out.print("Entre Numero: ");
        int b = sc.nextInt();
        int n = b ;
        int sum = 0 ;

        for (int i = 1; i <= b/2 ; i++) {
            if (b % i == 0) {
                sum += i ;
            }
        }
        if (sum == b) {
            System.out.println("Numero Perfecto!");
        } else {
            System.out.println("Numero Nigger!");
        }

        // palindrome
        System.out.println("Entre Stringo: ");
        String diddy = sc.nextLine();
        String rev = "";

        for (int i = diddy.length()-1; i >= 0; i--) {
            rev += diddy.charAt(i);
        }
        if (diddy.equals(rev)) {
            System.out.println("Stringo de palindrome.");
        } else {
            System.out.println("Stringo de bitch.");

        int a = sc.nextInt();
        int b = sc.nextInt();
        double res = 1;

        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        System.out.println(res);





    }
}
