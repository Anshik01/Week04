package junit;

public class TestingParameterizedTests {
    public static void main(String[] args) {
        System.out.println("Is Even? " + isEven(4));
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
