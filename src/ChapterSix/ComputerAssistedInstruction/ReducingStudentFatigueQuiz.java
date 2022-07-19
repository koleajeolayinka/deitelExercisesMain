package ChapterSix.ComputerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentFatigueQuiz {
    static Scanner scanner = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    static int firstDigit;
    static int secondDigit;
    static int Answer;
    static int userInput;
    static int CorrectRespond() {
        int correctResponsesNumber = secureRandom.nextInt(1, 4);

        switch (correctResponsesNumber) {
            case 1 -> System.out.println("Very good!");
            case 2 -> System.out.println("Excellent!");
            case 3 -> System.out.println("Nice work!!!");
            case 4 -> System.out.println("Keep up the good work!");
        }
        return correctResponsesNumber;
    }
    static int incorrectResponse() {
        int incorrectResponsesNumber = secureRandom.nextInt(1, 4);
        switch (incorrectResponsesNumber) {
            case 1 -> System.out.println("No. Please kindly do better.");
            case 2 -> System.out.println("Wrong. Try once more.");
            case 3 -> System.out.println("Don't give up!");
            case 4 -> System.out.println("No. Keep trying.");
        }
        return incorrectResponsesNumber;

    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO ULTIMATE MATH QUIZ NETWORK");
        runMathQuiz();
    }

    private static void runMathQuiz() {
        firstDigit = secureRandom.nextInt(10);
        secondDigit = secureRandom.nextInt(10);
        Answer = firstDigit * secondDigit;
        System.out.printf("How much is %d times %d%n", firstDigit, secondDigit);
        userInput = scanner.nextInt();
        displayCorrectResult();


    }

     static void displayCorrectResult() {
         if (userInput == Answer) {
             CorrectRespond();
             runMathQuiz();
         }
         else {
             incorrectResponse();
             runMathQuiz();
         }
    }


}

