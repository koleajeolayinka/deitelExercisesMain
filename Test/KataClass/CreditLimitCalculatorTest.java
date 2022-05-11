package KataClass;

import Chapter4.CreditAccount;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreditLimitCalculatorTest {
    @Test
    public void TestAccountNumberCanBeCreated(){
        CreditAccount account = new CreditAccount();
        account.setAccountNumber("0123456789");
        assertEquals("0123456789", account.getAccountNumber());

    }
    @Test
    public void TestItemCharged(){
        CreditAccount account = new CreditAccount();

    }
}
