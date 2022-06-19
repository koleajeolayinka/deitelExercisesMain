package Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, overallMax = 0, overallMin = Integer.MAX_VALUE;
        double sum = 0;
        System.out.println("Enter a sequence of positive integers, which will end with either 0 or a negative integer. ");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num == 0) {
                    scanner.close();
                    break;
                }
                overallMax = Math.max(overallMax, num);
                overallMin = Math.min(overallMin, num);
                count++;
                sum += num;
            } else {
                System.out.println("ERROR: Invalid Input. Enter a integer!");
                scanner.next();
            }
        }

        System.out.println("The maximum value is: " + overallMax);
        System.out.println("The minimum value is: " + overallMin);
        double avg = sum / count;
        System.out.println("Average: " + avg);
    }
}