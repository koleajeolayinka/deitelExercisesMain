package ChapterSix.DivisibleBy5;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static DivisibleBy5 divisibleBy5 = new DivisibleBy5();
    public static int correct = 0;
    public static int wrong = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to divisible of 5 checker");
        runDivisibleBy5();
    }

    private static void runDivisibleBy5() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Enter digits " + i + " numbers");
            int userInput = scanner.nextInt();
            divisibleBy5.setNumber(userInput);
            if (divisibleBy5.checkNumberSetDivisibleBy5()) {
                System.out.println(userInput + " is divisible by 5");
                correct = correct + 1;


            }
            else {
                System.out.println(userInput + " not divisible by 5");
                wrong = wrong + 1;
            }

        }
        System.out.println("your get " + correct + " divisible by 5 number");
        System.out.println("your get " + wrong + " in correct divisible by 5 number");

    }
}
