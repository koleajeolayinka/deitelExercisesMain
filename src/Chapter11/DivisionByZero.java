package Chapter11;

import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {
        display(input("enter numerator") / input("enter denominator") + " ");

        int numerator = input("ENTER NUMERATOR");
        int denominator = input("ENTER Denominator");
        try {
            int approximateQuotient = numerator / denominator;

            display(approximateQuotient + "");
        }
        catch (ArithmeticException px){
            display("You can not put zero;");

        }
    }



    private static int input(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {


            return scanner.nextInt();
        }
        catch (Exception exception){
            display(" I EXPECT ONLY INTEGER");
            display(" TRY AGAIN");
            input(prompt);
        }
        return number;
    }

    private static void display(String prompt) {
        System.out.println(prompt);
    }

}
