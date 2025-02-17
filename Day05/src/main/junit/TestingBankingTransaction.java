package junit;

import java.io.IOException;

class InsufficientFundException extends Exception{
    InsufficientFundException(String message){
        super(message);
    }
}

class BankAccount{
    String name;
    double balance;

    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) throws Exception{
        // if user try to withdraw money more than there bank account than it will throw exception
        if(amount > balance){
            throw new InsufficientFundException("Balance is insufficient");
        }

        balance -= amount;
        return balance;
    }

    // print balance
    public double getBalance(){
        return balance;
    }
}

public class TestingBankingTransaction {
    public static void main(String[] args) throws Exception{
        BankAccount bankAccount = new BankAccount("Anshik", 50000);
        System.out.println(bankAccount.deposit(2000));
        System.out.println(bankAccount.withdraw(25000));       // this will run smoothly
        System.out.println(bankAccount.withdraw(250000));     // throw insufficient balance exception
        System.out.println(bankAccount.withdraw(250000));
    }
}
