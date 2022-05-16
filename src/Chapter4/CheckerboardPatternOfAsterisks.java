package Chapter4;

import java.util.Scanner;

//4.33 (Checkerboard Pattern of Asterisks) Write an application that uses only the output statements
//        1   System.out.print("* ");
//        2   System.out.print(" ");
//        3   System.out.println();
//        to display the checkerboard pattern that follows. A System.out.println method call with no 
//        arguments causes the program to output a single newline character. [Hint: Iteration statements are
//        required.]
public class CheckerboardPatternOfAsterisks {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("WELCOME TO CHECKER BOARD OF ASTERISKS");
        runCheckerBoard(); 
    }

    private static void runCheckerBoard() {
        for (int i = 0; i < 4; i++) {
                System.out.print("* * * * * * * * ");
                System.out.println();
                System.out.print(" * * * * * * * *");
                System.out.println();


        }
    }
}
