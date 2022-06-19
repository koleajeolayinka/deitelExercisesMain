package Chapter4;

import java.util.Scanner;

public class ValidatingUserInput {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
RunApp();

    }
    public static void RunApp(){
        System.out.println("WELCOME TO USER INPUT VALIDATION ");
        System.out.println("ENTER A DIGIT 1?2");
        int valid = scanner.nextInt();
        if (valid == 1 || valid == 2) {
            System.out.println("valid");


        }else{
            RunApp();
        }
    }


}
