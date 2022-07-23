package Expleas;

import java.util.Scanner;

public class trialTest {
    public static int[] arr = new int[10];
    public static int[][] array = {{1, 2, 3, 4, 5},
                                    {2,3,4,90}};
    public static int[] arrays = {1, 2, 3, 4, 5, 1};
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] tobi){
        runTrialTest();
    }
    public static void runTrialTest(){
        int addArray = 0;
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {
            count = count + 1;

            addArray = addArray + arrays[i];
            System.out.print(" ");
            System.out.print(arrays[i]);
            System.out.println();

        }
        System.out.println(count + " count");
        System.out.println();
        System.out.println(addArray + " sum");

        System.out.println();
        System.out.println(array[1][3]);
        for (int i = 0; i < 10; i++) {
            arr[i] =  i * i;

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%5d%8d%n", i, arr[i]);

        }
    }
}
