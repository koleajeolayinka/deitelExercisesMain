package Chapter4;

import java.util.Scanner;

//4.20 (Tax Calculator) Develop a Java application that determines the total tax for each of three
//        citizens. The tax rate is 15% for earnings up to 30,000 USD earned by each citizen and 20% for all
//        earnings in excess of that ceiling. You are given a list with the citizens’ names and their earnings in
//        a given year. Your program should input this information for each citizen, then determine and dis-
//        play the citizen’s total tax. Use class Scanner to input the data.
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TAX CALCULATOR ");
        System.out.println("ENTER FIRST CITIZEN EARNING AMOUNT");
        int firstCitizen = scanner.nextInt();

        System.out.println("ENTER FIRST CITIZEN EARNING AMOUNT");
        int secondCitizen = scanner.nextInt();

        System.out.println("ENTER FIRST CITIZEN EARNING AMOUNT");
        int thirdCitizen = scanner.nextInt();

        if (firstCitizen >= 30000) {
            System.out.println("YOUR TAX RATE IS 20% FOR EARNING " + firstCitizen);
        }else{
            System.out.println("YOUR TAX RATE IS 15% FOR EARNING " + firstCitizen);
        }
        if (secondCitizen >= 30000) {
            System.out.println("YOUR TAX RATE IS 20% FOR EARNING " + secondCitizen);
        }else{
            System.out.println("YOUR TAX RATE IS 15% FOR EARNING " + secondCitizen);
        }
        if (thirdCitizen >= 30000) {
            System.out.println("YOUR TAX RATE IS 20% FOR EARNING " + thirdCitizen);
        }else{
            System.out.println("YOUR TAX RATE IS 15% FOR EARNING " + thirdCitizen);
        }
    }
}
