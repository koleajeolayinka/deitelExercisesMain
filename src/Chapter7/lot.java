package Chapter7;

import java.security.SecureRandom;
import java.util.Scanner;

public class lot {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to guess any two digits Game");
        runLot();
    }

    private static void runLot() {
        int guessNumber = secureRandom.nextInt(10, 99);
        int firstDigit = guessNumber / 10;
        int secondDigit = guessNumber % 10;
        System.out.println(firstDigit);
        System.out.println(secondDigit);
        System.out.println(guessNumber);
        System.out.println("Enter any two digit below");
        var userInput = scanner.nextInt();
        var userFirstDigit = userInput / 10;
        var userSecondDigit = userInput % 10;
        if (userInput == guessNumber) {
            System.out.println("The guess number is " + guessNumber);
            System.out.println(userInput + " matches exactly");

        }else if (userSecondDigit == firstDigit && userFirstDigit == secondDigit){
            System.out.println("The guess number is " + guessNumber);
            System.out.println(userInput + " Match all digits");
        }


    }
}
