package banktransactionsystem;

// definition of BankAccount class
public class BankAccount {
    // created a double variable to store the balance
    double balance;
    // parameterized constructor to initialize the object
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /*
        withdraw method that does the following:
        Throws InsufficientBalanceException if withdrawal amount exceeds balance.
        Throws IllegalArgumentException if the amount is negative.
    */
    void withdraw(double amount) {
        if (amount<0) {
            throw new IllegalArgumentException();
        }
        if (this.balance - amount < 0) {
            throw new InsufficientBalanceException();
        }
        // deduction of amount if it gets validation by not occurring any exception
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + this.balance);
    }
}
