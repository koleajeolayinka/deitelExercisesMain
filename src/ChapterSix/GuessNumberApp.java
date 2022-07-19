package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

//6.30 (Guess the Number) Write an application that plays “guess the number” as follows: Your
//        program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
//        The application displays the prompt Guess a number between 1 and 1000 . The player inputs a first
//        guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
//        low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
//        user for the next guess. When the user enters the correct answer, display Congratulations. You
//        guessed the number! and allow the user to choose whether to play again. [Note: The guessing technique
//        employed in this problem
public class GuessNumberApp {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static int guessNumber, userInput, numberOfGuess;
    public static int lessCounter, greaterCounter = 0;

    public static void main(String[] tobi){
        runGuessNumber();
        
    }

    public static void runGuessNumber() {
        guessNumber = secureRandom.nextInt(0, 1000) + 1;
        System.out.println("Guess a number between 1 - 1000");
        conditionStatement();

    }

    public static void conditionStatement() {
        userInput = scanner.nextInt();

        if (userInput == guessNumber) {
            runCorrectStatement();
        } else if (guessNumber >= userInput) {
            System.out.println("Your guess is too low \uD83D\uDC47");
            lessCounter++;
            tryAgainBar();
        }
        else {
            System.out.println("Your guess is too high \uD83D\uDC46");
            greaterCounter++;
            tryAgainBar();

        }
    }

    private static void runCorrectStatement() {
        System.out.println("Congratulation \uD83D\uDCA5 You guess the correct number \"" + userInput + "\"");
        numberOfGuess = lessCounter + greaterCounter;
        System.out.println("\uD83D\uDE33 wow you guess the number " + numberOfGuess + " times");


    }

    public static void tryAgainBar(){
        conditionStatement();
    }

}
