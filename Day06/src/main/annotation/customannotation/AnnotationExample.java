package annotation.customannotation;

import java.lang.reflect.Method;

public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        // access method "importantTask"
        Method method = TaskManager.class.getMethod("importantTask");

        // check if annotation is present in the method or not
        if(method.isAnnotationPresent(TaskInfo.class)){
            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority : " + taskInfo.priority());
            System.out.println("Assigned To : " + taskInfo.assignedTo());
        }
    }
}
