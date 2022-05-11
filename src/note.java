import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        System.out.print(Number >= 10 ? "pass" : "fail");
        while (Number <= 1000){
            Number =Number * 3;
            System.out.println(Number);
        }

    }
}
