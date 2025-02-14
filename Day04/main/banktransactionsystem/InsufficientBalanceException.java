package banktransactionsystem;

// definition of InsufficientBalanceException
public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
        super("Insufficient balance!"); // to get the message when exception occurs
    }
}
