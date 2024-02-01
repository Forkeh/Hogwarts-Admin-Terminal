import edu.hogwarts.Student;

public class Main {
    public static void main(String[] args) {
        initApp();
    }

    static void initApp() {
        System.out.println("App start!");

        Student harry = new Student(1999, 2004, false);

        System.out.println(harry);
    }
}