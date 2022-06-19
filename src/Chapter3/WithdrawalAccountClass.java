package Chapter3;

import java.util.Scanner;

public class WithdrawalAccountClass {

    public static Scanner scanner = new Scanner(System.in);
    public static WithdrawalAccount account = new WithdrawalAccount();
    public static void main(String [] args){
        System.out.println("WELCOME TO WITHDRAWAL ACCOUNT BAR");
        System.out.println("YOUR CURRENT ACCOUNT BALANCE IS: " + account.getAccountBalance());
        System.out.println("""
                PRESS --> 1 TO SAVE AND WITHDRAW ANYTIME
                PRESS --> 2 TO EXIT
                         
                """);
        int key = scanner.nextInt();
        
        switch (key){
            case 1: ToSaveOrWithdraw();
            case 2: ToExit();
        }

    }

    private static void ToExit() {

    }

    private static void ToSaveOrWithdraw() {
        System.out.println("HOW MUCH DO YOU WANT TO SAVE ");
        int AmountToSave = scanner.nextInt();
        account.setAccountBalance(AmountToSave);
        System.out.printf("YOUR CURRENT ACCOUNT BALANCE IS %d%n",account.getAccountBalance());
        System.out.println("""
                press --> 1 TO WITHDRAW
                PRESS --> 2 TO CLOSE APP
                """);
        int withdrawSite = scanner.nextInt();

switch (withdrawSite){
    case 1: ToWithdraw();
    case 2: ToCloseAPP();
}
    }

    private static void ToCloseAPP() {
    }

    private static void ToWithdraw() {
        System.out.println("HOW MUCH DO YOU WANT TO WITHDRAW FORM YOUR CURRENT BALANCE: " + account.getAccountBalance());
        int AmountToWithdraw = scanner.nextInt();
        account.setAmountWithdraw(AmountToWithdraw);

        System.out.println("YOU WITHDRAW  " + AmountToWithdraw + " SUCCESSFULLY\nYOUR CURRENT ACCOUNT BALANCE IS " + account.getAccountWithdrawExceedAccountBalance());


    }

}
