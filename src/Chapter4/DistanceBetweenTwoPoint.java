package Chapter4;

import java.util.Scanner;

//4.37 (Distance between two points) Write an application that reads the x and y coordinates of
//        two points on a plane and prints whether the points are located on a line perpendicular to an axis.
public class DistanceBetweenTwoPoint {
    public static int pointX;
    public static int pointY;
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("WELCOME TO DISTANCE BETWEEN TWO POINT CHECKER");
        runDistanceBetweenTwoPoint();
    }

    private static void runDistanceBetweenTwoPoint() {
        System.out.println("ENTER POINT X DIGIT");
        pointX = scanner.nextInt();
        System.out.println("ENTER POINT Y DIGIT");
        pointY = scanner.nextInt();
        if (pointY <= pointX && pointX <= pointY) {
            System.out.println("POINT X AND Y ARE BETWEEN TWO POINT");

        }else {
            System.out.println("THEY ARE BETWEEN TWO POINT");
        }
    }

}
