package Chapter5;


import java.util.Scanner;

//5.16 (Bar-Chart Printing Program) One interesting application of computers is to display
//        graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
//        number that’s read, your program should display the same number of adjacent asterisks. For exam-
//        ple, if your program reads the number 7, it should display ******* . Display the bars of asterisks after
//        you read all five numbers.
public class BarChartPrintingProgram {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("WELCOME TO BAR CHART");
        runBarChart();
    }

    private static void runBarChart() {
        System.out.println("ENTER YOUR Five number ASTERISKS TO PRINT");
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();
        int forthDigit = scanner.nextInt();
        int fifthDigit = scanner.nextInt();

        if (firstDigit <= 30 && secondDigit <= 30 && thirdDigit <= 30 && forthDigit <= 30 && fifthDigit <= 30) {
            for (int i = 0; i < firstDigit; i++) {
                System.out.print(" * ");
            }
            System.out.println();

            for (int i = 0; i < secondDigit; i++) {
                System.out.print(" * ");
            }
            System.out.println();

            for (int i = 0; i < thirdDigit; i++) {
                System.out.print(" * ");
            }
            System.out.println();

            for (int i = 0; i < forthDigit; i++) {
                System.out.print(" * ");
            }
            System.out.println();

            for (int i = 0; i < fifthDigit; i++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
        else{
            System.out.println("A PARTICULAR DIGIT IS GREATER THAN 30");
            runBarChart();
        }
    }
}
