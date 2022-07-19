package ChapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

//6.38 (Computer-Assisted Instruction: Difficulty Levels) Exercises 6.35–6.37 developed a computer
//        assisted instruction program to help teach an elementary school student multiplication. Modify
//        the program to allow the user to enter a difficulty level. At a difficulty level of 1, the program
//        should use only single-d
public class DifficultyLevels {
    public static Scanner scanner = new Scanner(System.in);
    public static SecureRandom secureRandom = new SecureRandom();
    public static int randFirstDigit, randSecondDigit, correctAnswer, userInput;
    public static int FirstDigit, SecondDigit, answer, input;
    public static double correctCounter, incorrectCounter = 0;
    public static double correctCounter0, incorrectCounter0 = 0;
    public static double correctPercentage, incorrectPercentage;

    public static void main(String[] args) {
        runDifficultLevels();

    }

    public static void runDifficultLevels() {
            for (int i = 1; i <= 10 ; i++) {
            randFirstDigit = secureRandom.nextInt(0, 9);
            randSecondDigit = secureRandom.nextInt(0, 9);
            correctAnswer = randFirstDigit * randSecondDigit;
                System.out.printf("(%d) How much is %d times %d ", i, randFirstDigit, randSecondDigit);

                userInput = scanner.nextInt();
            if (userInput == correctAnswer) {
                correctCounter++;
            }else {
                incorrectCounter++;
            }

        }
        checkIfUserIsQualifyForSecondStage();

    }

    private static void checkIfUserIsQualifyForSecondStage() {
        correctPercentage = (correctCounter / 10) * 100;
        incorrectPercentage = (incorrectCounter / 10) * 100;
        if (correctPercentage >= 75) {
            System.out.println("Well-done You are qualify for the next stage. ");
            System.out.printf("%nYou pass %.0f%n", correctCounter);
            System.out.printf("You fail %.0f%n", incorrectCounter);
            System.out.printf("Your percentage is %.0f%s Correct%n", correctPercentage, "%");
            runNextStage();
        }else {
            System.out.println("Please ask your teacher for extra help ");
            System.out.printf("%nYou pass %.0f%n", correctCounter);
            System.out.printf("You fail %.0f%n", incorrectCounter);
            System.out.printf("Your percentage is %.0f%s incorrect%n", incorrectPercentage, "%");
        }
    }

    private static void runNextStage() {
        for (int i = 1; i <= 10 ; i++) {
            FirstDigit = secureRandom.nextInt(0, 100);
            SecondDigit = secureRandom.nextInt(0, 100);
            answer = FirstDigit * SecondDigit;
            System.out.printf("(%d) How much is %d time %d ", i, FirstDigit, SecondDigit);
            input = scanner.nextInt();
            if (userInput == correctAnswer) {
                correctCounter0++;
            }else {
                incorrectCounter0++;
            }
        }
        CheckMate();
    }

    private static void CheckMate() {
        System.out.printf("You pass %.0f%n", correctCounter0);
        System.out.printf("You fail %.0f ", incorrectCounter0);
    }
}
