package Chapter5;

import java.util.Scanner;

//5.21 (Pythagorean Triples) A right triangle can have sides whose lengths are all integers. The set
//        of three integer values for the lengths of the sides of a right triangle is called a Pythagorean triple.
//        The lengths of the three sides must satisfy the relationship that the sum of the squares of two of the
//        sides is equal to the square of the hypotenuse. Write an application that displays a table of the
//        Pythagorean triples for side1 , side2 and the hypotenuse , all no larger than 500. Use a triple-nested
//        for loop that tries all possibilities. This method is an example of “brute-force” computing. You’ll
//        learn in more advanced computer-science courses that for many interesting problems there’s no
//        known algorithmic approach other than using sheer brute force.
public class PythagoreanTriples {
    public static Scanner scanner = new Scanner(System.in);
    public static int a;
    public static int b;
    public static int cal0;
    public static int cal1;
    public static int cal3;
    public static double hyp;
    public static void main(String[] args) {
        runPythagoreanTriples();

    }

    private static void runPythagoreanTriples() {
        System.out.println("enter side 1");
        a = scanner.nextInt();
        System.out.println("enter side 2");
        b = scanner.nextInt();
        cal0 = a * a;
        cal1 = b * b;
        cal3 = cal0 + cal1;
        hyp = Math.sqrt(cal3);
        System.out.printf("%.2f", hyp);
        System.out.println();
if (hyp <= 500){
    triangle();
}
else
    System.out.println("greater than 500");


    }

    private static void triangle() {
        for (int i = 0; i < hyp ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print('*');
                System.out.print(' ');


            }
            System.out.println();
        }
    }


}
