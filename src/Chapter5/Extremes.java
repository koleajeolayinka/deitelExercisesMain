package Chapter5;

import java.util.Scanner;

//5.11 (Extremes) Write an application that finds the minimum and maximum amongst several
//        integers and then computes the sum of the two extremes. The user will be prompted to input how
//        many values the application should ask the user to input.
public class Extremes {
    public static Scanner scanner = new Scanner(System.in);
    public static int userInput;
    public static void main(String[] args) {
        System.out.println("WELCOME TO EXTREMES APPLICATION ");
        runExtremes();
    }

    private static void runExtremes() {
        System.out.println("ENTER YOUR ");
        System.out.println("HOW MANY VALUE DO YOU WANT TO INPUT");
        userInput = scanner.nextInt();
    }

}
