import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) throws Exception{

        int[]number = takeInput();

        System.out.println("number1 = " + number[0] + ", number2 = " + number[1]);
        System.out.println("Answer after division : " + division(number[0], number[1]));
    }

    static int[] takeInput() throws Exception{
        Scanner scanner = new Scanner(System.in);

        // input might mismatch while taking input therefor it becomes an exception prone code
        try{
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            return new int[]{number1, number2};
        }

        // catching inputMismatchedException
        catch(InputMismatchException e){
            throw new Exception("input is not integer");
        }

    }

    static int division(int number1, int number2) throws Exception{
        int answer;

        // calculating division might get arithmetic exception therefor it becomes an exception prone code
        try{
            answer = number1/number2;
        }

        // catching arithmetic exception
        catch (ArithmeticException e){
            throw new Exception("divide by zero.");
        }

        return answer;
    }
}
