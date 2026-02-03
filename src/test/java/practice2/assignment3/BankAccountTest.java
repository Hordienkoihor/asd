package practice2.assignment3;

import org.junit.jupiter.api.Test;

public class BankAccountTest {
    @Test
    void depositShouldIncreaseBalance() {
        BankAccount testAccount = new BankAccount("0", 0);
        testAccount.deposit(100);

        assert testAccount.getBalance() == 100;

        testAccount.deposit(200);
        assert testAccount.getBalance() == 300;
    }
}
