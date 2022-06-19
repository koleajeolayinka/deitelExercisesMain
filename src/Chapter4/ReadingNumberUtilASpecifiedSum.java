package Chapter4;

import java.util.Scanner;

//4.34 (Reading numbers until a specified sum) Write an application that asks for a SetInput1 from
//        the user and then keeps reading integer values from the user until the sum of those integers equals
//        or becomes greater than the value that was input in the beginning.
public class ReadingNumberUtilASpecifiedSum {
    public static Scanner scanner = new Scanner(System.in);
    public static int counter;
    public static int digit;
    public static int userInput;
    public static void main(String[] args) {
        System.out.println("WELCOME TO READING NUMBER UTIL A SPECIFIED SUM ");
        runReadingNumber();
    }
    private static void runReadingNumber() {
        System.out.println("ENTER A SPECIFIED VALUE YOU WANT TO LOOP THROUGH ");
        userInput = scanner.nextInt();
counter = 0;
        for (int i = 0; i < userInput; i++) {
            System.out.println("A the digit util specified sum ");
          digit = scanner.nextInt();
          counter = counter + digit;
            System.out.println(counter);
            condition();

            }

        }

    private static void condition() {
        if (counter == userInput){
            System.out.println("A SPECIFIC DIGIT IS EQUAL TO SPECIFIC NUMBER");
            runReadingNumber();
        }else if(counter >= userInput){
            System.out.println("A SPECIFIC DIGIT IS GREATER THAN OR EQUAL TO SPECIFIC NUMBER");
        }
    }
}

