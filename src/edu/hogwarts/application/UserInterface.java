package edu.hogwarts.application;

import edu.generic.Person;
import edu.hogwarts.data.HogwartsPerson;

import java.util.*;
import java.util.function.Predicate;

public class UserInterface {

    private final StudentController studentController;
    private final TeacherController teacherController;
    private Collection<Person> combinedList;
    private Scanner sc;


    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.combinedList = combinedStudentTeacherLists();
        this.sc = new Scanner(System.in);
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
        System.out.println("Press 'x' to exit");
        System.out.println("--------------------------------------");


        redirect(sc.nextLine());
    }

    public void redirect(String input) {
        switch (input) {
            case "a" -> printPersonsList(this.combinedList);
            case "s" -> sortOptions();
            case "f" -> filterOptions();
            case "x" -> exit();
            default -> {
                System.out.println("Unknown input, try again");
                options();
            }
        }
    }

    public void exit() {
        System.out.println("Bye bye!");
    }

    public void printPersonsList(Collection<Person> personsList) {

        printPersonListHeader();

        printPersonListBody(personsList);

        options();
    }

    private void printPersonListBody(Collection<Person> personsList) {
        for (Person person : personsList) {
            String role = StudentOrTeacherConversion(person.getClass().toString());
            System.out.printf("| %-40s   %-15s   %15s   %15s   %10s   %15s   %10s |\n", person.getId(), person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge(), ((HogwartsPerson) person).getHouse().getName(), role);
        }
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
    }

    private void printPersonListHeader() {
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| %-40s   %-15s   %15s   %15s   %10s   %15s   %10s |\n", "ID", "Firstname", "Middlename", "Lastname", "Age", "House", "Role");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------|");
    }


    public void sortOptions() {
        Collection<Person> sortedList;

        while (true) {
            System.out.println("What would you like to sort by? Pick an option");
            System.out.println("1 - First name");
            System.out.println("2 - Middle name");
            System.out.println("3 - Last name");
            System.out.println("4 - Age");
            System.out.println("5 - House");


            switch (sc.nextLine()) {
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
                    continue;
                }
            }

            System.out.println("Would you like to reverse the order?");
            System.out.println("Type 'y' for yes, 'n' for no");

            switch (sc.nextLine()) {
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
            break;
        }
    }

    public void filterOptions() {
        Collection<Person> filterList = new ArrayList<>();

        System.out.println("What would you like to filter by? Pick an option");
        System.out.println("1 - Students");
        System.out.println("2 - Teachers");
        System.out.println("3 - House Gryffindor");
        System.out.println("4 - House Hufflepuff");
        System.out.println("5 - House Ravenclaw");
        System.out.println("6 - House Slytherin");

        switch (sc.nextLine()) {
            case "1" ->
                    filterList = filterPersons(person -> StudentOrTeacherConversion(person.getClass().toString()).contains("Student"));
            case "2" ->
                    filterList = filterPersons(person -> StudentOrTeacherConversion(person.getClass().toString()).contains("Teacher"));
            case "3" ->
                    filterList = filterPersons(person -> ((HogwartsPerson) person).getHouse().getName().equals("Gryffindor"));
            case "4" ->
                    filterList = filterPersons(person -> ((HogwartsPerson) person).getHouse().getName().equals("Hufflepuff"));
            case "5" ->
                    filterList = filterPersons(person -> ((HogwartsPerson) person).getHouse().getName().equals("Ravenclaw"));
            case "6" ->
                    filterList = filterPersons(person -> ((HogwartsPerson) person).getHouse().getName().equals("Slytherin"));
            default -> {
                System.out.println("Unknown command, try another");
                filterOptions();
            }
        }
        printPersonsList(filterList);

    }

    public String StudentOrTeacherConversion(String input) {
        return input.toLowerCase().contains("student") ? "Student" : "Teacher";
    }

    public List<Person> combinedStudentTeacherLists() {
        List<Person> personsList = new ArrayList<>();
        personsList.addAll(studentController.getAllStudents());
        personsList.addAll(teacherController.getAllTeachers());
        return personsList;
    }

    public Collection<Person> sortPersons(Comparator<Person> comparator) {
        List<Person> sortedList = combinedStudentTeacherLists();
        sortedList.sort(comparator);
        return sortedList;
    }

    public Collection<Person> filterPersons(Predicate<Person> predicate) {
        return new ArrayList<Person>(combinedList.stream().filter(predicate).toList());
    }
}
