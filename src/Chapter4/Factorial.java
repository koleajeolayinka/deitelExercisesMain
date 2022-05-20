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

    public static void main(String[] args) {
        System.out.println("WELCOME TO FACTORIAL APPLICATION");
        runFactorial();
    }

    private static void runFactorial() {
        System.out.println("ENTER NUMBER");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }



}
