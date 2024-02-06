package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.*;

import java.time.LocalDate;

public class Application {
    private StudentController studentController;
    private TeacherController teacherController;
    private InitApp initApp;
    private UserInterface userInterface;

public Application() {
    this.studentController = new StudentController();
    this.teacherController = new TeacherController();
    this.initApp = new InitApp();
    this.userInterface = new UserInterface();
    }
}