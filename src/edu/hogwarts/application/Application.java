package edu.hogwarts.application;

public class Application {
    private InitApp initApp;
    private UserInterface userInterface;

    public Application() {
    }

    public void startApp() {
        System.out.println("Start app");
        StudentController studentController = new StudentController();
        var initApp = new InitApp(studentController);
        initApp.createData();
        this.userInterface = new UserInterface(studentController);
        userInterface.printStudents();

    }
}