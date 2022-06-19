package Chapter4;

import java.util.Scanner;

//4.31 (Palindromes) A palindrome is a sequence of characters that reads the same backward as for-
//        ward. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
//        and 11611. Write an application that reads in a five-digit integer and determines whether it’s a
//        palindrome. If the SetInput1 is not five digits long, display an error message and allow the user to enter
//        a new value.
public class Palindromes { public static int userInput;
    public static void main(String [] args) {
        System.out.println("WELCOME TO PALINDROMES CHECKER ");
        runApp();
    }

    public static void runApp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER YOUR INTEGER BELOW TO CHECK IF IT IS PALINDROMES");
        userInput = scanner.nextInt();
        if (userInput > 99999) {
            System.out.println("ERROR ⛔\uD83D\uDEA8 YOUR DIGIT IS MORE THAN FIVE");
            runApp();
        }
        else {
            OpenPalindromesChecker();
        }
    }

    private static void OpenPalindromesChecker() {
        int firstDigit;
        firstDigit = userInput / 10000;
        int secondDigit = (userInput % 10000) / 1000;
        int thirdDigit = (userInput % 1000) / 100;
        int forthDigit = (userInput % 100) / 10;
        int fifthDigit = (userInput % 10);
        System.out.println(firstDigit + "" + secondDigit + "" + thirdDigit + "" + forthDigit + "" + fifthDigit);
        if (firstDigit == fifthDigit && secondDigit == forthDigit) {
            System.out.println(userInput + " <- IS A PALINDROMES ");

        }else {
            System.out.println(userInput +  " IS NOT A PALINDROME");
            runApp();
        }
    }
}
