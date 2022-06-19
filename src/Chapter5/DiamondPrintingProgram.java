package Chapter5;

import java.util.Scanner;

//5.24 (Diamond-Printing Program) Write an application that prints the following diamond
//        shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
//        line character. Maximize your use of iteration (with nested for statements), and minimize the num-
//        ber of output statements.
public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("  ");

            }
            for (int j = i; j <= 4 ; j++) {
                System.out.print("* ");

            }
            for (int j = i; j <= 3 ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }

}
