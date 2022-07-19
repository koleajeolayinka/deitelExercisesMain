package ChapterSix;
//6.24 (Perfect Numbers) An integer number is said to be a perfect number if its factors, including
//        1 (but not the number itself), correct to the number. For example, 6 is a perfect number, because 6 =
//        1 + 2 + 3. Write a method isPerfect that determines whether parameter number is a perfect number.
//        Use this method in an application that displays all the perfect numbers between 1 and 1000. display
//        the factors of each perfect number to confirm that the number is indeed perfect. Challenge the computing
//        power of your computer by testing numbers much larger than 1000. display the results.
import java.util.Scanner;

 class perfectNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static String Display;
    public static String input;
    public static int length;


    static boolean isPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i != num)
                    sum = sum + i + num / i;


                else
                    sum = sum + i;

            }

        }
        return sum == num && num != 1;


    }

    public static void main(String... args) {

        runPerfectNumber();

    }

    private static void runPerfectNumber() {
        Display = """
                Press 1 >> To Confirm Perfect Number
                Press 2 >> To Display Perfect Number
                """;
        System.out.println(Display);
        input = scanner.nextLine();
        switch (input.charAt(0)) {
            case '1' -> checkPerfectNumber();
            case '2' -> displayPerfectNumber();
            default -> IncorrectInput();

        }


    }

    private static void IncorrectInput() {
        System.out.println("Incorrect input kindly retry again");
        runPerfectNumber();
    }


    private static void displayPerfectNumber() {
        System.out.println("Enter the end length you want to display perfect number form 1  ");
        length = scanner.nextInt();
        for (int i = 2; i < length; i++) {
            if (isPerfectNumber(i))
                System.out.println(i);

        }


    }

    private static void checkPerfectNumber() {
        System.out.println("Enter a perfect number digit");
        int digit = scanner.nextInt();
            if (isPerfectNumber(digit)) {
                System.out.println(digit + " is perfect number");

            } else
                System.out.println(digit + " is not perfect number");

        }

    }

