package ChapterSix;

import java.util.Scanner;

public class BeautifyingStrings {
    public static Scanner scanner = new Scanner(System.in);
    public static String UserInput;
    public static String firstDigit;
    public static void main(String[] args) {
        System.out.println("Welcome to ultimate beautifying String");
        RunBeautifyingStrings();

        }

    private static void RunBeautifyingStrings() {
        System.out.println("PLEASE KINDLY INPUT A STRING ");
        UserInput = scanner.nextLine();
        runFullStopChecker();

    }

    private static void runFullStopChecker() {
        if (UserInput.contains(".")) {
            runFirstLetterCapitalizeChecker();
        }
        else
            System.out.println(UserInput + " does not contain full stop");



    }

    private static void runFirstLetterCapitalizeChecker() {
        firstDigit = UserInput.substring(0, 1).toUpperCase();
        if(UserInput.contains(firstDigit)) {
            runSuccessfullyBeautifyString();
        }
        else
            System.out.println("First LETTER IS NOT CAPITALIZE");


    }

    private static void runSuccessfullyBeautifyString() {
        System.out.println(UserInput + " IS WELL BEAUTIFY STRING");


    }
    public static void MatchingString(){
//        String s = "k";
//        String [] chars = s.split(^) //TODO USE A REGEX TO SPLIT UPPER CASE AND LOWER CASE LETTER AT THE BEGINNING OF A WORD
    }



}

