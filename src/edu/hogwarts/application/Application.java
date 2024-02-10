package edu.hogwarts.application;

public class Application {
    private UserInterface userInterface;

    public Application() {
    }

    public void startApp() {
        System.out.println("Start app");
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        var initApp = new InitApp(studentController, teacherController);
        initApp.createData();
        this.userInterface = new UserInterface(studentController, teacherController);
        userInterface.printStudents();

    }
}