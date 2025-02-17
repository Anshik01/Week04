package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator{
    int a;
    int b;

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    // private method that we want to access
    private void multiply(){
        System.out.println("Multiplication : " + (a*b));
    }
}
public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator(3,2);
        findMultiplication(calculator);
    }

    public static void findMultiplication(Calculator calculator) throws InvocationTargetException, IllegalAccessException {
        // methods[] array holds all the methods
        Method[] methods = calculator.getClass().getDeclaredMethods();

        for (Method method: methods) {
            // iterating through all the method array to find desired method
            if(method.getName().equals("multiply")){
                method.setAccessible(true);
                method.invoke(calculator);
            }
        }
    }
}
