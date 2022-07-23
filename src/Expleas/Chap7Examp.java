package Expleas;

import java.security.SecureRandom;

public class Chap7Examp {
    public static SecureRandom secureRandom = new SecureRandom();
    public static int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
    public static int[] arr = new int[10];

    public static void main(String[] args) {
        System.out.println("Grade distribution");
        runBarsChart0();
    }

    private static void runBarsChart0() {

        for (int i = 0; i < array.length; i++) {
            if (i == 10) {
                System.out.printf("%5d:", 100);
            } else {
                System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);

            }


            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    runMit();
    }

    private static void runMit() {
        for (int i = 1; i <= 60_000 ; i++) {
            ++arr[1 + secureRandom.nextInt(3)];


        }
        for (int i = 1; i < 7; i++) {
            System.out.printf("%d%n", arr[i]);

        }
        StudentPoll();
    }

    private static void StudentPoll() {
        int[] intiArray = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for (int i = 0; i < intiArray.length; i++) {
            try {
                ++frequency[intiArray[i]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("   responses[%d] = %d%n%n", i, intiArray[i]);
            }

        }
    }


}