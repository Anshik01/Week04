package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayDetails(){
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

}

public class DynamicallyCreateObjects {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> studentClass = Class.forName("reflection.Student");

        // constructor of studentClass with parameter name and age
        Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class, int.class);

        // creating new instance using constructor and defining it's parameters
        Object studentObject = constructor.newInstance("Anshik", 20);

        // using displayDetails method from studentClass
        Method method = studentClass.getMethod("displayDetails");

        // invoke method with studentObject
        method.invoke(studentObject);
    }
}
