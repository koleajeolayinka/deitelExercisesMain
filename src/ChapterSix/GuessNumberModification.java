package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

//6.31 (Guess-the-Number Modification) Modify the program of Exercise 6.30 to count the number
//         of guesses the player makes. If the number is 10 or fewer, display Either you know the secret
//        or you got lucky! If the player guesses the number in 10 tries, display Aha! You know the secret!
//        If the player makes more than 10 guesses, display You should be able to do better! Why should it
//        take no more than 10 guesses? Well, with each “good guess,” the player should be able to eliminate
//        half of the numbers, then half of the remaining numbers, and so on.
public class GuessNumberModification {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static int guessNumber, userInput, numberOfCorrectNumber;
    public static int greaterNumberCounter, lesserNumberCounter = 0;

    public static void main(String[] tobiloba){
        runGuessNumberModification();
    }

    public static void runGuessNumberModification() {
        guessNumber = secureRandom.nextInt(0, 1000) + 1;
        System.out.println("Guess the number modification between 1 - 1000");

        runConditionStatement();

    }

    public static void runConditionStatement() {
        System.out.println(guessNumber);
        userInput = scanner.nextInt();
        if (userInput == guessNumber) {
            runCorrectNumber();
        } else if (userInput >= guessNumber) {
            System.out.println("\"" + userInput + "\" is too high \uD83D\uDD7A");
            greaterNumberCounter++;
            tryAgain();

        }else {
            System.out.println("\"" + userInput + "\" is too low \uD83C\uDFC4");
            lesserNumberCounter++;
            tryAgain();
        }
    }

    public static void tryAgain() {
        runConditionStatement();
    }

    private static void runCorrectNumber() {
        numberOfCorrectNumber = greaterNumberCounter + lesserNumberCounter;
        if (numberOfCorrectNumber >= 10 && numberOfCorrectNumber <= 15) {
            System.out.println("you know the secret \"" + userInput + "\" is correct ✅\uD83C\uDF89");
            System.out.println("you got it " + numberOfCorrectNumber + " times");

        } else if (numberOfCorrectNumber >= 2 && numberOfCorrectNumber <= 10 ) {
            System.out.println("Aha! You know the secret! \"" + userInput + "\" is correct ✅\uD83C\uDF89");
            System.out.println("you got it " + numberOfCorrectNumber + " times");
        } else if (numberOfCorrectNumber >= 10) {
            System.out.println("\"" + userInput + "\" your guesses is too much");
        }
        else {
            System.out.println("Wow \uD83D\uDE2E, good guess you get it once \uD83E\uDD47");

        }

    }
}
