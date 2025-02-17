package annotation.customannotation;

// defining a class that uses custom annotation
public class TaskManager {
    // applying @TaskInfo annotation to a method
    @TaskInfo(priority = "High", assignedTo = "Anshik")
    public void importantTask(){
        System.out.println("Task need to be completed.");
    }
}
