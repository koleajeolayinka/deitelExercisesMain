package Chapter4;

import java.util.Scanner;

//4.30 (Right-angled Triangle) Write an application that prompts the user to enter the length of
//        the base of a triangle, and uses that to draw a right-angled triangle composed of asterisks. Your
//        program should work for triangles of base lengths between 1 and 10.
public class RightAngledTriangle {
    public static int length;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("WELCOME TO RIGHT ANGLED TRIANGLE APPLICATION\n\tWHERE YOU CAN DISPLAY THE TRIANGLE LENGTH BETWEEN 1 - 10");
       runAngledTriangle();
    }
    private static void runAngledTriangle() {
        System.out.println("KINDLY ENTER THE TRIANGLE LENGTH YOU WANT TO DISPLAY ");
        length = scanner.nextInt();
        if (length >= 11) {
            System.out.println("ERROR⛔\uD83D\uDEA8 YOUR DIGIT IS MORE THAN 10");
            System.out.println("TRY AGAIN");
            runAngledTriangle();
        }else {
            PrintTriangle();
        }


    }

    private static void PrintTriangle() {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
