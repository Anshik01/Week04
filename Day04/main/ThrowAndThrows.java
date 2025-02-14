import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        double rate = scanner.nextDouble();
        int year = scanner.nextInt();

        try{
            // keeping exception prone code in try block
            calculateInterest(amount, rate, year);
        }
        // catching IllegalArgument exception here
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    static void calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
        if(amount<0 || rate<0){
            // throwing an exception if amount and rate is negative
            throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
        }
        else{
            // return simpleInterest instead
            System.out.println("Simple interest : " + (amount*rate*years)/100.0);
        }
    }
}
