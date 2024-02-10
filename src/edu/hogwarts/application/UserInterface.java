package edu.hogwarts.application;

import edu.generic.Person;
import edu.hogwarts.data.HogwartsPerson;

import java.util.*;

public class UserInterface {

    private final StudentController studentController;
    private final TeacherController teacherController;
    private Collection<Person> combinedList;


    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.combinedList = combineStudentTeacherLists();
    }

    public void start() {
        System.out.println("Welcome to Hogwarts admin page!");
        options();
    }

    public void options() {
        System.out.println("--------------------------------------");
        System.out.println("Press 'a' to see list");
        System.out.println("Press 's' to see sorted list");
        System.out.println("Press 'f' to see filtered list");
        System.out.println("--------------------------------------");

        Scanner sc = new Scanner(System.in);

        redirect(sc.nextLine());
    }

    public void redirect(String input) {
        switch (input) {
            case "a" -> {
                printPersonsList(this.combinedList);
            }
            case "s" -> sortOptions();
            case "f" -> System.out.println("FILTER");
            default -> {
                System.out.println("Unknown input, try again");
                options();
            }
        }
    }

    public void printPersonsList(Collection<Person> personsList) {

        System.out.printf("| %-40s - %-15s - %15s - %15s - %10s - %15s - %10s |\n", "ID", "Firstname", "Middlename", "Lastname", "Age", "House", "Role");

        for (Person person : personsList) {
            String role = StudentOrTeacherConversion(person.getClass().toString());
            System.out.printf("| %-40s - %-15s - %15s - %15s - %10s - %15s - %10s |\n", person.getId(), person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), ((HogwartsPerson) person).getHouse().getName(), role);
        }

        options();
    }


    public void sortOptions() {
        System.out.println("What would you like to sort by? Pick an option");
        System.out.println("1 - First name");
        System.out.println("2 - Middle name");
        System.out.println("3 - Last name");
        System.out.println("4 - Age");
        System.out.println("5 - House");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Collection<Person> sortedList = new ArrayList<>();

        switch (input) {
            case "1" -> {
                sortedList = sortPersons(Comparator.comparing(Person::getFirstName));
            }
            case "2" -> {
                sortedList = sortPersons(Comparator.comparing(Person::getMiddleName));
            }
            case "3" -> {
                sortedList = sortPersons(Comparator.comparing(Person::getLastName));
            }
            case "4" -> {
                sortedList = sortPersons(Comparator.comparing(Person::getAge));
            }
            case "5" -> {
                sortedList = sortPersons(Comparator.comparing(person -> ((HogwartsPerson) person).getHouse().toString()));
            }
            default -> {
                System.out.println("Unknown command, try another");
                sortOptions();
            }
        }

        System.out.println("Would you like to reverse the order?");
        System.out.println("Type 'y' for yes, 'n' for no");
        input = sc.nextLine();

        switch (input) {
            case "y" -> {
                Collections.reverse((List<Person>) sortedList);
                printPersonsList(sortedList);
            }
            case "n" -> {
                printPersonsList(sortedList);
            }
            default -> {
                System.out.println("Unknown command, try another");
                sortOptions();
            }
        }
    }

    public String StudentOrTeacherConversion(String input) {
        return input.toLowerCase().contains("student") ? "Student" : "Teacher";
    }

    public List<Person> combineStudentTeacherLists() {
        List<Person> personsList = new ArrayList<>();
        personsList.addAll(studentController.getAllStudents());
        personsList.addAll(teacherController.getAllTeachers());
        return personsList;
    }

    public Collection<Person> sortPersons(Comparator<Person> comparator) {
        List<Person> sortedList = combineStudentTeacherLists();
        sortedList.sort(comparator);
        return sortedList;
    }
}
