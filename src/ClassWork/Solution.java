package ClassWork;

public class Solution{
    public static String[][] arr = new String[10][10];
    public static void main(String[] args) {

        arr[9][9] = "ooo*";
        arr[1][1] = "ooo*";
        arr[0][0    ] = "ooo*";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {

                System.out.print( "  " + arr[i][j] + "  ");

            }
            System.out.println();

        }
        System.out.println("\n\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}