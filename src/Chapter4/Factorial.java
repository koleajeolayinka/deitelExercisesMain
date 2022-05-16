package Chapter4;
//4.38 (Factorial) The userInput of a non-negative integer n is written as n! (pronounced “n
//        userInput”) and is defined for values of n greater than or equal to 1 as:
//        n! = n · (n – 1) · (n – 2) · … · 1
//        and for the n value 0 as:
//        n! = 1
//        For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
//        a) Write an application that reads a non-negative integer and computes and prints its
//        userInput.
//        b) Write an application that estimates the value of the mathematical constant e by using
//        the following formula. Allow the user to enter the number of terms to calculate.
//                 1        1       1
//        e = 1 + ----- + ----- + ----- + …
//                  1!      2!      3!
//        c) Write an application that computes the value of e x by using the following formula. Al-
//        low the user to enter the number of terms to calculate.
//
//                 x       x^2      x^3
//        e = 1 + ----- + ----- + ----- + …
//                  1!      2!      3!

import java.util.Scanner;

public class Factorial {
    public static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static int firstDigit;
    public static int secondDigit;
    public static int thirdDigit;
    public static int forthDigit;
    public static int fifthDigit;
    public static int sixDigit;
    public static int sevenDigit;
    public static int eightDigit;
    public static int nineDigit;
    public static int tenDigit;
    public static void main(String[] args) {
        System.out.println("WELCOME TO FACTORIAL APPLICATION");
        runFactorial();
    }

    private static void runFactorial() {
        System.out.println("ENTER A DIGIT TO CHECK THE FACTORIAL");
        userInput = scanner.nextInt();
        PrintFactorial();
    }

    private static void PrintFactorial() {
firstDigit = userInput / 1000000000;
secondDigit = (userInput % 1000000000) / 100000000;
thirdDigit = (userInput % 100000000) / 10000000;
forthDigit = (userInput % 10000000) / 1000000;
fifthDigit = (userInput % 1000000) / 100000;
sixDigit = (userInput % 100000) / 10000;
sevenDigit = (userInput % 10000) / 1000;
eightDigit = (userInput % 1000) / 100;
nineDigit = (userInput % 100) / 10;
tenDigit = (userInput % 10);
calculate();
    }

    private static void calculate() {
        if (userInput <= 10) {
           int  factorial0 = userInput * (userInput - 1);

        }
    }
}
