package Chapter4;

import java.util.Scanner;

//.32 (Printing the Decimal Equivalent of a Binary Number) Write an application that inputs
//        an integer containing only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint:
//        Use the remainder and division operators to pick off the binary SetInput1’s digits one at a time, from
//        right to left. In the decimal SetInput1 system, the rightmost digit has a positional value of 1 and the
//        next digit to the left a positional value of 10, then 100, then 1000, and so on. The decimal SetInput1
//        234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary SetInput1 system, the rightmost digit
//        has a positional value of 1, the next digit to the left a positional value of 2, then 4, then 8, and so
//        on. The decimal equivalent of binary 1101 is 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8, or 1 + 0 + 4 + 8 or, 13.]
public class PrintingTheDecimalEquivalentOfABinaryNumber {
    public static int digit;
    public static int firstDigit;
    public static int secondDigit;
    public static int thirdDigit;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        System.out.println("WELCOME PRINT DECIMAL EQUIVALENT OF A BINARY NUMBER ");
        runDecimalEquivalent();
    }

    private static void runDecimalEquivalent() {
        System.out.println("ENTER YOUR DIGIT");
        digit = scanner.nextInt();
        if(digit >= 0 && digit <= 1000){
           firstDigit = digit / 100;
           secondDigit = (digit % 100) / 10;
           thirdDigit = (digit % 10);
            System.out.println(thirdDigit + " * 1 + " + secondDigit + " * 10 + " + firstDigit + " * 100" + " IS EQUIVALENT TO BINARY NUMBER ");
            System.out.print(thirdDigit + secondDigit  * 10 +  firstDigit  * 100);
        }
        else if(digit >= 1000 ){
            firstDigit = digit / 1000;
            secondDigit = (digit % 1000) / 100;
            thirdDigit = (digit % 100) / 10;
            int forthDigit = (digit % 10);
            System.out.println(forthDigit + " * 1 + " + thirdDigit + " * 2 + " + secondDigit + " * 4" + firstDigit + " * 8" + " is the same as ");
            System.out.println(forthDigit + thirdDigit * 2 + secondDigit * 4 + firstDigit * 8);

        }

    }
}
