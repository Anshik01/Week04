package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperation{
    int a;
    int b;

    MathOperation(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }

    public int sub(){
        return a-b;
    }

    public int mul(){
        return a*b;
    }

    public int div(){
        return a/b;
    }

}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter operation you want to perform(add, sub, mul or div) : ");
            // taking input which method to perform
            String operation = scanner.next();

            System.out.println("Enter two numbers : ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            // accessing MathOperation class dynamically using reflection
            Class<?> mathClass = Class.forName("reflection.MathOperation");

            // accessing MathOperation class's constructor dynamically using reflection
            Constructor<?> constructor = mathClass.getDeclaredConstructor(int.class, int.class);

            // creating new instance without new keyword dynamically
            Object mathObject = constructor.newInstance(num1, num2);

            // access method provided by user
            Method method = mathClass.getMethod(operation);

            // invoke method and store result in object
            Object result = method.invoke(mathObject);

            System.out.println("Result : " + result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
