package Chapter2;

import java.util.Scanner;

public class CostOfDriving {
    public static double distance;
    public static double miles;
    public static double price;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        runCostOfDriving();
        costOfDriving();
    }

    private static void costOfDriving() {
        double cal0 = miles / price;
        double cal1 = distance / cal0;
        System.out.printf("THE COST OF DRIVING IS ₦%.2f",cal1);
    }

    private static void runCostOfDriving() {
        System.out.print("ENTER THE DRIVING DISTANCE: ");
        distance = scanner.nextDouble();
        runMiles();



    }

    private static void runMiles() {
        System.out.print("ENTER MILES PER GALLON: ");
        miles = scanner.nextDouble();
        runPrice();
    }

    private static void runPrice() {
        System.out.print("ENTER PRICE PER GALLON: ");
        price = scanner.nextDouble();
    }
}
