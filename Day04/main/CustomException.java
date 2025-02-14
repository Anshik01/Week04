import java.util.Scanner;

// creating an exception by extending Exception
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        // validateAge method checks if age>=18
        validateAge(age);
    }

    static void validateAge(int age) throws Exception{      // method throws an exception
        if(age >= 18){
            System.out.println("Age : " + age);
        }
        else{
            // throwing an exception because age<18
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
