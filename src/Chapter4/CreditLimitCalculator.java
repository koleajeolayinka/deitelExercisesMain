package Chapter4;

import java.util.Scanner;

//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of sev-
//        eral department-store customers has exceeded the credit limit on a charge account. For each cus-
//        tomer, the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//        play the message "Credit limit exceeded" .
public class CreditLimitCalculator {
    public static Scanner scanner = new Scanner(System.in);
    public static CreditAccount account = new CreditAccount();
    public static void main(String[] args) {
        System.out.print("WELCOME TO CREDIT LIMIT CALCULATOR ");
       RunCreditLimitCalculator();
    }

    private static void RunCreditLimitCalculator() {
        System.out.println("ENTER ACCOUNT NUMBER");
        String accNumber = scanner.next();
        account.setAccountNumber(accNumber);

        System.out.println("YOUR BALANCE AG THE BEGINNING OF THE MONTH");
        int Balance = scanner.nextInt();
        ItemCharged();
    }

    private static void ItemCharged() {
        System.out.printf("");
    }
}
