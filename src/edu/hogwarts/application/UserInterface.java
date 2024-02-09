package edu.hogwarts.application;

import edu.generic.Student;

public class UserInterface {

    private final StudentController studentController;


    public UserInterface(StudentController studentController) {
        this.studentController = studentController;
    }


    public void printStudents() {

        System.out.printf("| %-10s - %10s - %10s - %10s |\n", "Firstname", "Middlename", "Lastname", "Age");

        for (Student student : studentController.getAllStudents()) {
            System.out.printf("| %-10s - %10s - %10s - %10s|\n", student.getFirstName(), student.getMiddleName(), student.getLastName(), student.getAge());
        }


    }
}
