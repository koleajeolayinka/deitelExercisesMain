package Chapter4;

import java.util.Scanner;

//4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5,000, or
//        a total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are shown in Fig. 4.33. Develop a Java application that inputs one salesperson’s items
//        sold for last week and calculates and displays that salesperson’s earnings. There’s no limit to the num-
//        ber of items that can be sold.
//        Item    Value
//        1       239.99
//        2       129.75
//        3       99.95
//        4       350.89
//        Fig. 4.33 | Item values for Exercise 4.19.
public class SalesCommissionCalculator {
    public static Scanner scanner = new Scanner(System.in);
    public static int itemNumber;
    public static void main(String[] args) {
        System.out.println("WELCOME TO SALES COMMISSION CALCULATOR ");
        runSalesCommissionCalculator();
    }

    private static void runSalesCommissionCalculator() {
        System.out.println("ENTER NUMBER ITEM SOLD ");
        itemNumber = scanner.nextInt();

        for (int i = 1; i <= itemNumber; i++) {
            System.out.println("ENTER ITEM " + i + " VALUE");
            int value = scanner.nextInt();
            float initialValue = (value) + (5000 * 9 / 100);
            System.out.printf("item\tvalue%n%d%13.2f%n", i, initialValue);
            ++i;

        }
    }

}
