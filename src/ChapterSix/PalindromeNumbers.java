package ChapterSix;

import java.util.Scanner;

public class PalindromeNumbers {
    public static Scanner scanner = new Scanner(System.in);
    public static int firstDigit;
    public static int secondDigit;
    public static int thirdDigit;
    public static int forthDigit;
    public static int fifthDigit;
    public static String palindromeNumber;
    public static String newUserInput;


    public static int UserInput;
    public static void main(String[] args) {
        runPalindromeNumbers();
    }

    private static void runPalindromeNumbers() {
        System.out.println("Enter a palindrome numbers");
        UserInput = scanner.nextInt();
        if (UserInput >= 10000 && UserInput < 100000) {
            runPalindromeCal();

        }
        else
           runRetry();
    }

    private static void runRetry() {
        System.out.println("YOUR INPUT IS NOT FIVE DIGIT");
        System.out.println("KINDLY RETRY");
        runPalindromeNumbers();
    }

    private static void runPalindromeCal() {
        firstDigit = (UserInput / 10000);
        secondDigit = (UserInput % 10000) / 1000;
        thirdDigit = (UserInput % 1000) / 100;
        forthDigit = (UserInput % 100) / 10;
        fifthDigit = (UserInput % 10);



        palindromeNumber = firstDigit + "" + secondDigit + "" +thirdDigit + "" +  secondDigit + "" +firstDigit;


        runConfirmation();

    }

    private static void runConfirmation() {
        newUserInput = String.valueOf(UserInput);
       if (newUserInput.contains(palindromeNumber)){
           System.out.println(newUserInput + " is a Palindrome");


       }
       else
           System.out.println(UserInput + " is Not palindrome");
    }
}
