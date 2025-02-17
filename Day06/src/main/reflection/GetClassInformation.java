package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Animal{
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Animal speaks");
    }

    public void walk(){
        System.out.println("Animal walk");
    }

}

public class GetClassInformation {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();

        String path = "main.reflection.";
        System.out.println(returnFieldName(className));
        System.out.println(returnMethodName(className));
        System.out.println(returnConstructorName(className));
    }

    public static List<Method> returnMethodName(String className) throws ClassNotFoundException{

        Class<?> animal = Class.forName(className);

        Method[] methods = animal.getMethods();

        System.out.println("Name of all the methods : ");

        return new ArrayList<>(Arrays.asList(methods));

    }

    public static List<Field> returnFieldName(String className) throws ClassNotFoundException {

        Class<?> animal = Class.forName(className);

        Field[] fields = animal.getDeclaredFields();

        System.out.println("Name of all the  Fields: ");

        return new ArrayList<>(Arrays.asList(fields));

    }

    public static List<Constructor<?>> returnConstructorName(String className) throws ClassNotFoundException {

        Class<?> animal = Class.forName(className);

        Constructor<?>[] fields = animal.getConstructors();

        System.out.println("Name of all the  Constructor: ");

        return new ArrayList<>(Arrays.asList(fields));

    }
}
