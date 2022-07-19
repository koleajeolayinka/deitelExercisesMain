package ChapterSix.ComputerAssistedInstruction;

import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Scanner;

//6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
//        Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
//        addition issues only, 2 means subtraction issues only, 3 means multiplication issues only,
//        4 means division issues only and 5 means a random mixture of all these types.
public class VaryingTheTypesOfProblems {
    public static SecureRandom secureRandom = new SecureRandom();
    public static Scanner scanner = new Scanner(System.in);
    public static ReducingStudentFatigueQuiz ra = new ReducingStudentFatigueQuiz();
    public static String display, userInput;
    public static int input, firstDigit, secondDigit, answer, randSign;
    public static char addSign, subSign, mulSign, divSign;
    public static int correctCounter, incorrectCounter = 0;

    public static void main(String[] Toby){
        System.out.println("Welcome to the ultimate maths quiz");
        runTypesOsProblem();
    }

    private static void runTypesOsProblem() {
        display = """
                Press 1 -> Addition
                Press 2 -> Subtraction
                Press 3 -> multiplication
                Press 4 -> division
                Press 5 -> randomMixture
                """;
        printOut(display);
        userInput = scanner.nextLine();
        switch (userInput) {
            case "2" -> subtractionMenu();
            case "1" -> additionMenu();
            case "3" -> multiplicationMenu();
            case "4" -> divisionMenu();
            case "5" -> randomMixtureMenu();
            default  -> incorrectInput();
        }
    }

    private static void incorrectInput() {
    }

    private static void randomMixtureMenu() {
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(1, 9);
            secondDigit = secureRandom.nextInt(1, 9);
            System.out.printf("Question %d -> %d ",
                    i, firstDigit);
            randMathSign();
            System.out.printf(" %d = ", secondDigit);
            try {
                input = scanner.nextInt();
            }catch (Exception ignored){}
            if (randSign == 1) {
                answer = firstDigit + secondDigit;
            } else if (randSign == 2) {
                answer = firstDigit - secondDigit;
            } else if (randSign == 3) {
                answer = firstDigit * secondDigit;
            } else if (randSign ==4) {
                answer = firstDigit / secondDigit;

            }
            if (input == answer){
                System.out.println("Yea answer is " + answer);
                correctCounter++;
                ReducingStudentFatigueQuiz.CorrectRespond();

            }else {
                System.out.println("Incorrect answer is " + answer);
                incorrectCounter++;
                ReducingStudentFatigueQuiz.incorrectResponse();
            }
        }
        System.out.printf("You Score %d Correctly%n", correctCounter);
        System.out.printf("You Score %d Incorrectly", incorrectCounter);

    }

    private static void randMathSign() {
        randSign = secureRandom.nextInt(0, 4)+ 1;

        switch (randSign) {
            case 1 -> {
                addSign = '+';
                System.out.print(addSign);

            }
            case 2 -> {
                subSign = '-';
                System.out.print(subSign);
            }
            case 3 -> {
                mulSign = 'X';
                System.out.print(mulSign);
            }
            case 4 -> {
                divSign = '/';
                System.out.print(divSign);
            }
        }
    }

    private static void divisionMenu() {
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(0, 9);
            secondDigit = secureRandom.nextInt(0, 9);
            answer = firstDigit / secondDigit;
            System.out.printf("Question %d -> %d / %d = ",
                    i, firstDigit, secondDigit);
            input = scanner.nextInt();
            if (input == answer) {
                correctCounter++;
            }else {
                incorrectCounter++;
            }

        }
        OverallResult();
    }

    private static void multiplicationMenu() {
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(0, 9);
            secondDigit = secureRandom.nextInt(0, 9);
            answer = firstDigit * secondDigit;
            System.out.printf("Question %d -> %d X %d = ",
                    i, firstDigit, secondDigit);
            input = scanner.nextInt();
            if (input == answer) {
                correctCounter++;
            }else {
                incorrectCounter++;
            }

        }
        OverallResult();
    }

    private static void subtractionMenu() {
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(0, 9);
            secondDigit = secureRandom.nextInt(0, 9);
            answer = firstDigit - secondDigit;
            System.out.printf("Question %d -> %d - %d = ",
                    i, firstDigit, secondDigit);
            input = scanner.nextInt();
            if (input == answer) {
                correctCounter++;
            }else {
                incorrectCounter++;
            }

        }
        OverallResult();

    }


    private static void additionMenu() {
        int correctAddition = 0, incorrectAddition = 0;
        for (int i = 1; i <= 10; i++) {
            firstDigit = secureRandom.nextInt(0, 9);
            secondDigit = secureRandom.nextInt(0, 9);
            answer = firstDigit + secondDigit;
            System.out.printf("Question %d -> %d - %d = ",
                    i, firstDigit, secondDigit);
            input = scanner.nextInt();
            if (input == answer) {
                correctCounter++;
                correctAddition++;
            }else {
                incorrectCounter++;
                incorrectAddition++;
            }

        }
        OverallResult();

    }




    private static void OverallResult() {
        System.out.printf("You Score %d Correctly%n", correctCounter);
        System.out.printf("You Score %d Incorrectly", incorrectCounter);
    }

    private static void printOut(String message) {
        System.out.println(message);
    }
}
