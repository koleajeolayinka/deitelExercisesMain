package Chapter5;

import java.util.Scanner;

//5.20 (Calculating the Value of π ) Calculate the value of π from the infinite series
//Print a table that shows the value of π approximated by computing the first 200,000 terms of this
//series. How many terms do you have to use before you first get a value that begins with 3.14159?
public class ValueOfPi {
    public static Scanner scanner = new Scanner(System.in);
    public static final double pi = Math.PI;
    public static void main(String[] args) {
        System.out.println("");
//        System.out.println(pi);
        runValueOfPi();
    }


    private static void runValueOfPi() {
        for (int i = 0; i < 200_000; i++) {
            try {
                System.out.println(4 - 4 / 3 + 4 / +i);
            }catch (ArithmeticException ignored){

            }


        }





        }
    }

