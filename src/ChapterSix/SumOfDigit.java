package ChapterSix;

import java.util.Scanner;

public class SumOfDigit {
    public static Scanner scanner = new Scanner(System.in);
    static String userInput;
    public static void main(String[] args){
        System.out.println("WELCOME TO SUM OF DIGIT");
        runSumOfDigit();
    }

    private static void runSumOfDigit() {
        System.out.println("Please kindly enter a digit");
        userInput = scanner.nextLine();
        checkEachDigit();


    }

    private static void checkEachDigit() {
        switch (userInput.length()) {
            case 1 -> runSumOfOneDigit();
            case 2 -> runSumOfTwoDigit();
            case 3 -> runSumOfThreeDigit();
            case 4 -> runSumOfFourDigit();
            case 5 -> runSumOfFiveDigit();
            case 6 -> runSumOfSixDigit();
            case 7 -> runSumOfSevenDigit();
            case 8 -> runSumOfEightDigit();
            case 9 -> runSumOfNineDigit();
            default -> System.out.println("Your input is too large");
        }

    }

    private static void runSumOfNineDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second = (digit % 100) / 10;
        int third = (digit % 1000) / 100;
        int forth =(digit % 10000) / 1000;
        int fifth =(digit % 100000) / 10000;
        int six =(digit % 1000000) / 100000;
        int seven =(digit % 10000000) / 1000000;
        int eight =(digit % 100000000) / 10000000;
        int nine =(digit % 1000000000) / 100000000;
        System.out.println(first + second + third + forth + fifth + six + seven + eight + nine);
        runContinueIf();
    }

    private static void runSumOfEightDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second = (digit % 100) / 10;
        int third = (digit % 1000) / 100;
        int forth =(digit % 10000) / 1000;
        int fifth =(digit % 100000) / 10000;
        int six =(digit % 1000000) / 100000;
        int seven =(digit % 10000000) / 1000000;
        int eight =(digit % 100000000) / 10000000;
        System.out.println(first + second + third + forth + fifth + six + seven + eight);
        runContinueIf();
    }

    private static void runSumOfSevenDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second =(digit % 100) / 10;
        int third =(digit % 1000) / 100;
        int forth =(digit % 10000) / 1000;
        int fifth =(digit % 100000) / 10000;
        int six =(digit % 1000000) / 100000;
        int seven =(digit % 10000000) / 1000000;
        System.out.println(first + second + third + forth + fifth + six + seven);
        runContinueIf();
    }

    private static void runSumOfSixDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second = (digit % 100) / 10;
        int third = (digit % 1000) / 100;
        int forth = (digit % 10000) / 1000;
        int fifth = (digit % 100000) / 10000;
        int six = (digit % 1000000) / 100000;
        System.out.println(first + second + third + forth + fifth + six);
        runContinueIf();
    }

    private static void runSumOfFiveDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second =(digit % 100) / 10;
        int third =(digit % 1000) / 100;
        int forth =(digit % 10000) / 1000;
        int fifth =(digit % 100000) / 10000;
        System.out.println(first + second + third + forth + fifth);
        runContinueIf();
    }

    private static void runSumOfFourDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second =(digit % 100) / 10;
        int third =(digit % 1000) / 100;
        int forth =(digit % 10000) / 1000;
        System.out.println(first + second + third + forth);
        runContinueIf();
    }

    private static void runSumOfThreeDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second =(digit % 100) / 10;
        int third =(digit % 1000) / 100;
        System.out.println(first + second + third);
        runContinueIf();
    }

    private static void runSumOfTwoDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        int second =(digit % 100) / 10;
        System.out.println(first + second);
        runContinueIf();

    }

    private static void runSumOfOneDigit() {
        int digit = Integer.parseInt(userInput);
        int first = digit % 10;
        System.out.println(first);
        runContinueIf();
    }

    private static void runContinueIf() {
        String displayInput = """
                Enter 'ok' to continue
                Press anything to stop
                """;
        System.out.println(displayInput);
        String input = scanner.nextLine().toLowerCase();
        if ("ok".equals(input)) {
            pushUp();
            runSumOfDigit();
        } else {
            System.out.println("Bye");
        }
    }
    private static void pushUp(){
        for (int i = 1; i < 5000; i++) {
            System.out.println(" ");

        }
    }
}
