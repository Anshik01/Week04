import java.util.Scanner;

public class ExceptionPropagation {
    static int division(int number1, int number2) throws ArithmeticException{
        if(number2 == 0){
            // throwing arithmetic exception if dividend is 0
            throw new ArithmeticException("Divide by zero");
        }

        // return answer of the operation
        return number1/number2;
    }

    static int method2(int number1, int number2) throws ArithmeticException{
        // calling this method in another method
        return division(number1, number2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // handling the exception here
        try{
            System.out.println(" Division : " + method2(number1, number2));
        } catch (Exception e) {
            throw new ArithmeticException(e.getMessage());
        }
    }
}
