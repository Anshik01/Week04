package banktransactionsystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(10000); // BankAccount object with initial balance, 10000
        // try catch block to handle InsufficientBalanceException
        try {
            // calling withdraw method, trying to withdraw insufficient amount
            account1.withdraw(11000); // this will generate exception
        } catch (InsufficientBalanceException i) {
            System.out.println(i.getMessage());
        }

        System.out.println();

        // try catch block to handle IllegalArgumentException
        BankAccount account2 = new BankAccount(10000);
        try {
            // calling withdraw method, putting negative argument
            account2.withdraw(-3000); // this will generate exception
        } catch (IllegalArgumentException i) {
            System.out.println("Invalid amount!");
        }
    }
}
