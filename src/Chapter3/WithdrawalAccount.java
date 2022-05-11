package Chapter3;


public class WithdrawalAccount {
    private static int AmountWithdraw;
    public static int AccountBalance;
    public static int TotalBalance = AccountBalance - AmountWithdraw;


    public static int WithdrawalAccount() {
        return AccountBalance;
    }

    public void setAccountBalance(int AccountBalance) {
        this.AccountBalance = AccountBalance;

    }

    public int getAccountBalance() {
        return AccountBalance;
    }

    public void setAmountWithdraw(int AmountWithdraw) {
        this.AmountWithdraw = AmountWithdraw;
    }

    public int getAccountTotalBalance() {
        int TotalBalance = AccountBalance - AmountWithdraw;

        return TotalBalance;
    }

    public int getAccountWithdrawExceedAccountBalance() {
        if (AmountWithdraw > AccountBalance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
else
    return AccountBalance - AmountWithdraw;
        return getAccountWithdrawExceedAccountBalance();

    }

    public int getAmountWithdraw() {
        return AmountWithdraw;
    }
}

