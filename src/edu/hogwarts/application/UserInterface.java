package edu.hogwarts.application;

import edu.generic.Person;
import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.List;

public class UserInterface {

    private final StudentController studentController;
    private final TeacherController teacherController;


    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }


    public void printStudents() {

        List<Person> personsList = new ArrayList<>();
        personsList.addAll(studentController.getAllStudents());
        personsList.addAll(teacherController.getAllTeachers());

        System.out.printf("| %-10s - %10s - %15s - %10s - %10s - %10s |\n", "Firstname", "Middlename", "Lastname", "Age", "House", "Role");

        for (Person person : personsList) {
            String role = StudentOrTeacherConversion(person.getClass().toString());
            System.out.printf("| %-10s - %10s - %15s - %10s - %10s - %10s |\n", person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), ((HogwartsPerson) person).getHouse().getName(), role);
        }


    }

    public String StudentOrTeacherConversion(String input) {
        return input.toLowerCase().contains("student") ? "Student" : "Teacher";
    }
}
