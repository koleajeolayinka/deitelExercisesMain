package KataClass.Chapter3;

import Chapter3.WithdrawalAccount;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

//3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called with-
//        that withdraws money from an Account . Ensure that the withdrawal amount does not exceed
//        the Account ’s balance. If it does, the balance should be left unchanged and the method should print
//        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
//        (Fig. 3.9) to test method withdraw.
public class WithdrawalAccountTest {
    @Test
    public void testAccountBalance() {
        WithdrawalAccount account = new WithdrawalAccount();
        account.setAccountBalance(1000);
        assertEquals(1000, account.getAccountBalance());
    }

    @Test
    public void TestForAccountCanWithdraw() {
        WithdrawalAccount account = new WithdrawalAccount();
        account.setAccountBalance(100);
        account.setAmountWithdraw(11);
        assertEquals(11, account.getAmountWithdraw());
        assertEquals(89, account.getAccountTotalBalance());

    }

    @Test
    public void TestIfAmountWithdrawDoesNotExceedAccountBalance() {
        WithdrawalAccount account = new WithdrawalAccount();
        account.setAccountBalance(1000);
        account.setAmountWithdraw(100);
        assertEquals(900, account.getAccountWithdrawExceedAccountBalance());
    }
}
