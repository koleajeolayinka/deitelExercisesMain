package ChapterSix;

import java.util.Scanner;
import java.util.concurrent.Callable;

//6.25 (Prime Numbers) A positive integer is prime if it’s divisible by only 1 and itself. For example,
//        2, 3, 5 and 7 are prime, but 4, 6, 8 and 9 are not. The number 1, by definition, is not prime.
//        a) Write a method that determines whether a number is prime.
//        b) Use this method in an application that determines and displays all the prime numbers
//        less than 10,000. How many numbers up to 10,000 do you have to test to ensure that
//        you’ve found all the primes?
//        c) Initially, you might think that n/2 is the upper limit for which you must test to see
//        whether a number n is prime, but you need only go as high as the square root of n. Rewrite
//        the program, and run it both ways.
public class primeNumbers {
    static Scanner scanner = new Scanner(System.in);
    static String displayText;
    static String userInput;
    public static void main(String[] args){
        System.out.println("Welcome to prime number application");
        runPrimeNumberApp();

    }

    private static void runPrimeNumberApp() {
        displayText = """
                Press 1 ->> To determine whether a number is prime number
                Press 2 ->> To display prime Number
                """;
        userInput = scanner.nextLine();
        switch (userInput.charAt(0)) {
            case '1' -> determinePrimeNumber();
            case '2' -> displayPrimeNumber();
        }
        

        }

    private static void displayPrimeNumber() {
    }

    private static void determinePrimeNumber() {

    }


}

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.