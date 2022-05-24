package AssignmentDen.Estore;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application extends User {
    public static String name;
    public static String userMenu;
    public static int numberOfWear;
    public static User user = new User();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE BEST E-STORE IN THE WORLD");
        runEStore();
    }

    private static void runEStore() {
        System.out.println("ENTER YOUR NAME ");
        name = scanner.nextLine();
        System.out.println("ENTER YOUR EMAIL-ADDRESS ");
        String email = scanner.nextLine();
        user.setEmail(email);
        System.out.println("ENTER YOUR HOME-ADDRESS ");
        String HomeAddress = scanner.nextLine();
        user.setHomeAddress(HomeAddress);
        System.out.println("KINDLY CREATE A STRONG PASSWORD TO SECURE ACCOUNT");
        System.out.println("ENTER YOUR PASSWORD BELOW");
        String password = scanner.nextLine();
        user.Password(password);
        System.out.println("ENTER YOUR PHONE-NUMBER ");
        String PhoneNumber = scanner.nextLine();
        System.out.println("HI " + name + ", CONGRATULATION YOUR ACCOUNT IS SUCCESSFULLY CREATED" );

        runUserInput();



    }

    private static void runUserInput() {
        System.out.println("""
                ENTER 1 >-> TO BUY
                ENTER 2 >-> TO SELL
                """);
        userMenu = scanner.nextLine();
        switch (userMenu) {
            case "1" -> ToBuyProduct();
            case "2" -> ToSellProduct();
            default -> WrongInput();
        }

    }

    private static void WrongInput() {
        System.out.println("INCORRECT INPUT KINDLY TRY AGAIN");
        runUserInput();

    }

    private static void ToSellProduct() {

    }

    private static void ToBuyProduct() {
        System.out.println("""
                PRESS 1 ->> TO BUY ELECTRONICS
                PRESS 2 ->> TO BUY GROCERIES
                PRESS 3 ->> TO BUY UTENSILS
                PRESS 4 ->> TO BUY DESIGNER WEARS
                """);
        String BuyerMenu = scanner.nextLine();
        switch (BuyerMenu){
            case "1": ToBuyElectronics();
            break;
            case "2": ToBuyGroceries();
            break;
            case "3": ToBuyUtensils();
            break;
            case "4": ToBuyDesignerWear();
        }
    }

    private static void ToBuyDesignerWear() {
        try {
            System.out.println("HOW MANY DESIGNER WEAR DO YOU WANT TO ADD TO YOUR CART ");
             numberOfWear = scanner.nextInt();
        }catch (InputMismatchException ignored){

        }
        finally {
            System.out.print("WRONG INPUT");

        }
        System.out.println("CONGRATULATION WILL HAVE " +  user.getAge() + " YEARS OLD DESIGNER WEAR\n\tAVAILABLE FOR YOU ");


    }

    private static void ToBuyUtensils() {
        System.out.println("Under construction");
        ToBuyDesignerWear();
    }

    private static void ToBuyGroceries() {
        System.out.println("Under construction");
        ToBuyDesignerWear();
    }

    private static void ToBuyElectronics() {
        System.out.println("Under construction");
        ToBuyDesignerWear();

    }
}
