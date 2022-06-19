package Chapter4;
//4.22 (Tabular Output) Write a Java application that uses looping to print the following table of
//        values:
//        N N^2 N 3

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO TABULAR OUTPUT");
        System.out.println("HOW MANY TABULAR OUTPUT YOU WANT TO CHECK");
        int table = scanner.nextInt();
        System.out.printf("%n%s%7s%7s%7s", "N", "N^2", "N^3", "N^4");
        for (int i = 1; i <= table; i++) {
            System.out.printf("%n%d%7d%7d%8d", i, i*i, i*i*i, i*i*i*i);


        }

    }
}
