package Expleas;

import java.util.Scanner;

public  class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating point number");
        double number1 = scanner.nextInt();
        double number2 = scanner.nextInt();
        double number3 = scanner.nextInt();
        double result = maximum(number1, number2, number3);
        System.out.println("maximum value = "+ result);
    }

    private static double maximum(double x, double y, double z) {
        double maximumValue = y;
        if(x >= maximumValue ){
            maximumValue = x;
        }
        if(z >= maximumValue ){
            maximumValue = z;
        }

        return maximumValue;
    }
}
