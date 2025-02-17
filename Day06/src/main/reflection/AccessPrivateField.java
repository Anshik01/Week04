package reflection;

import java.lang.reflect.Field;

class Person{
    String name;
    private int age;

    public int getAge(){
        return age;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception{
        Person person = new Person("Anshik", 20);

        System.out.println("Changed age : " + changeAge(person, 22));
    }

    public static int changeAge(Person person, int age) throws IllegalAccessException {
        Field[] fields = person.getClass().getDeclaredFields();

        for (Field field : fields) {
            if(field.getName().equals("age")){
                field.setAccessible(true);
                field.set(person, age);
            }
        }

        return person.getAge();
    }
}
