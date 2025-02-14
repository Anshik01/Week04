import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input for the array
        System.out.println("Enter Number Of Elements:");
        int numberOfElements = sc.nextInt();
        int [] arr = new int[numberOfElements];

        // taking inputs for array elements
        System.out.println("Enter Elements:");
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = sc.nextInt();
        }

        // taking input for divisor
        System.out.println("Enter Divisor");
        int divisor = sc.nextInt();

        // taking input for the index of the dividend in the array
        System.out.println("Enter Index Of Dividend In The Array:");
        int indexOfDividend = sc.nextInt();

        // try-catch to handle ArrayIndexOutOfBoundsException
        try {
            int dividend = arr[indexOfDividend]; // accessing the element
            // nested try-catch to handle ArithmeticException
            try {
                int quotient = dividend / divisor;
                int remainder = dividend % divisor;
                System.out.println("Quotient: " + quotient + "\nRemainder: " + remainder);
            } catch (ArithmeticException a) {
                System.out.println("Cannot divide by zero!");
            }
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Invalid array index!");
        }
    }
}
