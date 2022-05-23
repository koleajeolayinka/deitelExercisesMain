package Chapter5;

import java.util.Scanner;

//5.24 (Diamond-Printing Program) Write an application that prints the following diamond
//        shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
//        line character. Maximize your use of iteration (with nested for statements), and minimize the num-
//        ber of output statements.
public class DiamondPrintingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length");
        int number = scanner.nextInt();
        System.out.println("enter the shape");
        String shape = scanner.next();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {


            System.out.print(shape);
                System.out.print(' ');
        }
            System.out.println();
    }
}
}