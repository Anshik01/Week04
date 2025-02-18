package annotation.repeatableannotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
public @interface BugReport {

    String description();
}
