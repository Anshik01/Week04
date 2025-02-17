package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Anshik", 50000);

    @Test
    @DisplayName("Testing deposit method")
    void Test(){
        double amount = 1200;
        double expectedOutput = bankAccount.balance + amount;

        double actualOutput = bankAccount.deposit(amount);

        assertEquals(expectedOutput, actualOutput);

    }


    @Test
    @DisplayName("Testing withdraw method")
    void Test1() throws Exception{
        double amount = 1200;
        double expectedOutput = bankAccount.balance - amount;

        double actualOutput = bankAccount.withdraw(amount);

        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    @DisplayName("When amount is more than balance")
    void Test2(){
        Exception exception = assertThrows(InsufficientFundException.class, () -> {
            bankAccount.withdraw(5461230);
        });

        assertEquals("Balance is insufficient", exception.getMessage());
    }

    @Test
    @DisplayName("Test getbalance method")
    void Test3(){
        assertEquals(50000, bankAccount.balance);
    }
}