package Chapter4;

import java.util.Scanner;

//4.36 (Creating a Comparator) Write an application that works as a comparator. Your program
//        should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
//        number is greater, and –1 if the second number is greater
public class CreateingAComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO COMPARATOR\n\tWHERE ZERO MEAN THE NUMBER IS EQUAL\n 1 IS FIRST NUMBER IS GREATER THAN\n-1 IS SECOND NUMBER IS GREATER THAN ");
        System.out.println("ENTER YOUR FIRST DIGIT");
        int firstDigit = scanner.nextInt();

        System.out.println("ENTER YOUR SECOND DIGIT");
        int secondDigit = scanner.nextInt();

        if (firstDigit == secondDigit) {
            System.out.println(0);

        }else if(firstDigit >= secondDigit){
            System.out.println(1);
        }else {
            System.out.println(-1);
        }

    }
}
