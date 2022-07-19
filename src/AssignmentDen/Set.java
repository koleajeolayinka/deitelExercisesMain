package AssignmentDen;

import java.util.Scanner;

public class Set {
    public static Scanner scanner = new Scanner(System.in);
    public static int SetInput1;
    public static int size1;
    public static int[][] array = new int[SetInput1][size1];

    public static void main(String[] args) {

        runSet();
    }

    private static void runSet() {
        System.out.println("ENTER SET 1 LENGTH");
        size1 = scanner.nextInt();
        System.out.println("ENTER SET 1:");
            SetInput1 = scanner.nextInt();
            System.out.println(SetInput1);
        System.out.println(array.length);

    }
}
