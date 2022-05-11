import java.util.Scanner;



public class Switch {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        RunApp();
    }

    private static void RunApp() {
        System.out.println("WELCOME FACEBOOK");
        System.out.println("""
                1 ->> USERName
                2 ->> password
                """);
        int userInput = scanner.nextInt();

        switch (userInput){
            case 1: UserName();
            case 2: password();
            default: other();

        }
    }

    private static void other() {
        System.out.println("other");
    }

    private static void UserName() {
        System.out.println("USERNAME");
    }

    private static void password() {
        System.out.println("password");
    }
}
