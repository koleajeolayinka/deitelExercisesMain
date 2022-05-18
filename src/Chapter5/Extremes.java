package Chapter5;

import java.util.Arrays;
import java.util.Scanner;

//5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
//        integers and then computes the sum of the two extremes. The user will be prompted to input how
//        many values the application should ask the user to input.
public class Extremes {
    public static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static int Number;
    public static int total = 0;
    public static int[] small = new  int[Number];
    public static void main(String[] args) {
        System.out.println("WELCOME TO EXTREMES APPLICATION\nDISPLAY THE TWO EXTREMES VALUES FOR MAXIMUM AND MINIMUM ");
        runExtremes();
    }

    private static void runExtremes() {
        System.out.println("HOW MANY VALUE DO YOU WANT TO INPUT");
        userInput = scanner.nextInt();
        for (int i = 1; i <= userInput; i++) {
            System.out.println("ENTER YOUR VALUES");
            Number = scanner.nextInt();
total = total + i;
        }
        System.out.println("TOTAL = " +total);
        System.out.println("MINIMUM VALUE IS "+ Arrays.toString(small));


    }

}
