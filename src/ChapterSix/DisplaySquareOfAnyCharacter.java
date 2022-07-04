package ChapterSix;

import java.util.Scanner;

public class DisplaySquareOfAnyCharacter {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("WELCOME TO SQUARE DISPLAYED CHARACTER APPLICATION ");
        System.out.println("Enter character you want to display");
        char firstChar = scanner.next().charAt(0);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(firstChar);

            }
            System.out.println();
        }
    }

}
