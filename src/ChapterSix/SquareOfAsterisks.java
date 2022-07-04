package ChapterSix;

import java.util.Scanner;
//6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
//        square (the same number of rows and columns) of asterisks whose side is specified in integer parameter
//        side . For example, if side is 4 , the method should display
//        ****
//        ****
//        ****
//        ****
//        Incorporate this method into an application that reads an int
public class SquareOfAsterisks {
    public static Scanner scanner = new Scanner(System.in);
    public static int row;
    public static int column;
    public static char dot;
    public static void main(String[] args) {
        System.out.println("WELCOME TO SQUARE OF ASTERISKS");
        runSquareOfAsterisk();
    }

    private static void runSquareOfAsterisk() {
        System.out.println("ENTER YOUR ROW");
        row = scanner.nextInt();
        System.out.println("ENTER YOUR COLUMN");
        column = scanner.nextInt();
        System.out.println("ENTER ANY CHARACTER YOU WANT TO DISPLAY");
        dot = scanner.next().charAt(0);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(dot);
                System.out.print(' ');

            }
            System.out.println();

        }
    }
}
