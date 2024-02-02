import edu.hogwarts.Student;
import edu.hogwarts.Teacher;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        initApp();
    }

    static void initApp() {
        System.out.println("App start!");

        Student harry = new Student("Harry", "Potter" ,1999, 2004, false);
        Teacher dumbledore = new Teacher("Sevarus", "Snape", "Teacher", LocalDate.now(),LocalDate.now());

        System.out.println(dumbledore);
    }

}