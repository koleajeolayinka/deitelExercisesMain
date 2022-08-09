package Chapter7;

import java.util.Scanner;

public class TriangleBarchart {
    public static int[] array =  new int[7];
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        runMain();

    }
    public static void runMain(){
        for (int i = 0; array.length > i; i ++){
            array[i] = scanner.nextInt();

        }

        for(int i = 0; array.length > i; i++) {
            System.out.println(array[i]);

            for (int j = 0; j < array[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
