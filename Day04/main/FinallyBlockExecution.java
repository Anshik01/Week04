import java.util.Scanner;

public class FinallyBlockExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Division : " + division(number1, number2));
    }

    static int division(int number1, int number2){
        try{
            // keeping exception prone code in try block
            return number1/number2;
        }

        // catching arithmetic exception here and printing exception method
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally {
            // this message will display even if code has exception
            System.out.println("Operation executed.");
        }

        return -1;
    }
}
