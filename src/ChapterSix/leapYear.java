package ChapterSix;

import java.util.Scanner;

class leapYear {
    public static int year;
    public static int userInput;
    public static String display;
     public static Scanner scanner = new Scanner(System.in);
     public static void main(String[] args) {
         System.out.println("WELCOME TO LEAP YEAR CALCULATOR");
         runLeapYear();
     }

    public static void runLeapYear() {
        System.out.println("Enter a year to check if it's a leap year");
        year = scanner.nextInt();
        checkLeapYear();

    }

    public static void checkLeapYear() {
        if (year % 4 == 0)
            System.out.println(year + " IS A LEAP YEAR");
        else
            System.out.println(year + " IS NOT A LEAP YEAR");
        Notification();
    }

    public static void Notification() {
         display = """
                PRESS 1 <>-> TO CONTINUE
                PRESS 2 <>-> TO EXIT
             
                """;
        System.out.println(display);
        userInput = scanner.nextInt();
        switch (userInput) {
            case  1 -> ToContinue();
            case  2 -> exitApp();
            default -> System.out.println();
        }

    }

    public static void ToContinue() {
         runLeapYear();

    }

    public static void exitApp() {
        System.out.println("BYE");
    }


}
