import java.util.Scanner;

public class Array {/**/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] xo = new char[3][3];
        xo[0][0] = 'X';
        xo[0][1] = 'O';
        xo[0][2] = 'X';

        xo[1][0] = 'X';
        xo[1][1] = 'X';
        xo[1][2] = 'X';

        xo[2][0] = 'O';
        xo[2][1] = 'X';
        xo[2][2] = 'O';


        System.out.println(xo[0][0] + " " + xo[0][1] + " " + xo[0][2]);
        System.out.println(xo[1][0] + " " + xo[1][1] + " " + xo[1][2]);
        System.out.println(xo[2][0] + " " + xo[2][1] + " " + xo[2][2]);


        System.out.println("enter SetInput1");
        int number = scanner.nextInt();
        double prime = Math.ceil(number);


        for (int i = 0; i <number;i++){

        }

        }

    }

