package junit;

import java.util.Scanner;

public class TestingExceptionHandling {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // trying to divide two numbers
        divide(number1,number2);
    }

    public static void divide(int number1, int number2) throws Exception{
        // program will throw an error if denominator is 0
        if(number2 == 0){
            throw new ArithmeticException("Divide number by zero.");
        }

        System.out.println(number1/number2);
    }
}
