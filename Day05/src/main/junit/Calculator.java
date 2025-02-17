package junit;

public class Calculator {

    // method to add two numbers
    public static int add(int number1, int number2){
        return number1+number2;
    }

    // method to subtract two numbers
    public static int subtract(int number1, int number2){
        return number1-number2;
    }

    // method to multiply two numbers
    public static int multiply(int number1, int number2){
        return number1*number2;
    }

    // method to divide two numbers
    public static int divide(int number1, int number2) throws Exception{
        if(number2 == 0){
            throw new ArithmeticException("Divide by 0.");
        }

        return number1/number2;
    }

    public static void main(String[] args)  throws Exception{
        System.out.println("Addition : " + add(2,1));
        System.out.println("Subtraction : " + subtract(2,1));
        System.out.println("Multiplication : " + multiply(3,2));
        System.out.println("Division : " + divide(4,2));
    }
}
