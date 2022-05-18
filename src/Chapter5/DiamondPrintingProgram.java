package Chapter5;
//5.24 (Diamond-Printing Program) Write an application that prints the following diamond
//        shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
//        line character. Maximize your use of iteration (with nested for statements), and minimize the num-
//        ber of output statements.
public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        for (int i = 0; i <20; i+=1) {
            for (int j =0 ; j < i; j++) {
                System.out.print("*");
                System.out.print(' ');

            }
            System.out.println();
        }
    }
}
