package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.*;

import java.time.LocalDate;

public class InitApp {
    private final StudentController studentController;
    private final TeacherController teacherController;

    public InitApp(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;

    }

    public void createData() {
        System.out.println("Creating data!");

        // Houses
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red", "Gold"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Silver"});
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});

        // Teachers
        HogwartsTeacher headmaster = new HogwartsTeacher("Albus", "Dumbledore", "Percival", LocalDate.of(1881, 8, 17),
                "Headmaster", LocalDate.of(1935, 9, 1), null, gryffindor, false);

        HogwartsTeacher headOfGryffindor = new HogwartsTeacher("Minerva", "McGonagall", "Euphemia", LocalDate.of(1925, 10, 4),
                "Transfiguration Professor", LocalDate.of(1956, 9, 1), null, gryffindor, true);

        HogwartsTeacher headOfSlytherin = new HogwartsTeacher("Severus", "Snape", "", LocalDate.of(1960, 1, 9),
                "Potions Master", LocalDate.of(1981, 9, 1), null, slytherin, true);

        HogwartsTeacher headOfHufflepuff = new HogwartsTeacher("Pomona", "Sprout", "", LocalDate.of(1941, 5, 15),
                "Herbology Professor", LocalDate.of(1974, 9, 1), null, hufflepuff, true);

        HogwartsTeacher headOfRavenclaw = new HogwartsTeacher("Filius", "Flitwick", "", LocalDate.of(1958, 10, 17),
                "Charms Master", LocalDate.of(1980, 9, 1), null, ravenclaw, true);

        // Students
        HogwartsStudent harry = new HogwartsStudent("Harry", "Potter", "James", LocalDate.of(1980, 7, 31),
                1991, 1998, true, gryffindor, true, new String[]{"Quidditch"});

        HogwartsStudent hermione = new HogwartsStudent("Hermione", "Granger", "Jean", LocalDate.of(1979, 9, 19),
                1991, 1998, true, gryffindor, true, new String[]{"Study Group"});

        HogwartsStudent ronald = new HogwartsStudent("Ron", "Weasley", "Bilius", LocalDate.of(1980, 3, 1),
                1991, 1998, true, gryffindor, false, new String[]{"Wizard Chess"});

        HogwartsStudent draco = new HogwartsStudent("Draco", "Malfoy", "", LocalDate.of(1980, 6, 5),
                1991, 1998, true, slytherin, true, new String[]{"Slytherin Quidditch"});

        HogwartsStudent luna = new HogwartsStudent("Luna", "Lovegood", "", LocalDate.of(1981, 2, 13),
                1992, 1999, true, ravenclaw, true, new String[]{"The Quibbler"});

        HogwartsStudent cedric = new HogwartsStudent("Cedric", "Diggory", "", LocalDate.of(1977, 9, 1),
                1989, 1995, true, hufflepuff, true, new String[]{"Hufflepuff Quidditch"});

        HogwartsStudent neville = new HogwartsStudent("Neville", "Longbottom", "", LocalDate.of(1980, 7, 30),
                1991, 1998, true, gryffindor, false, new String[]{});

        HogwartsStudent pansy = new HogwartsStudent("Pansy", "Parkinson", "", LocalDate.of(1980, 6, 12),
                1991, 1998, true, slytherin, false, new String[]{});

        HogwartsStudent cho = new HogwartsStudent("Cho", "Chang", "", LocalDate.of(1979, 10, 2),
                1991, 1998, true, ravenclaw, true, new String[]{"Ravenclaw Quidditch"});

        HogwartsStudent cormac = new HogwartsStudent("Cormac", "McLaggen", "", LocalDate.of(1979, 5, 1),
                1991, 1998, true, gryffindor, false, new String[]{"Gryffindor Quidditch"});

        HogwartsStudent justin = new HogwartsStudent("Justin", "Finch-Fletchley", "", LocalDate.of(1979, 8, 4),
                1991, 1998, true, hufflepuff, false, new String[]{});

        HogwartsStudent marietta = new HogwartsStudent("Marietta", "Edgecombe", "", LocalDate.of(1980, 1, 4),
                1991, 1998, true, ravenclaw, false, new String[]{});

        // Year group
        Student[] students1991 = {harry, hermione, ronald, neville, draco, pansy, cormac, justin, marietta};
        YearGroup yearGroup1991 = new YearGroup(1991, LocalDate.now(), students1991);

        // Subject
        Subject subjectPotions = new Subject("Potions", 6, false);

        // Teaching materials
        TextBook bookAdvancedPotionMaking = new TextBook("Advanced Potion Making", true, true, false, "Essential for N.E.W.T. level Potions", "Advanced Potion Making", "Libatius Borage", "Acme Publishing", 1947);

        // Tools
        Tool toolCauldron = new Tool("Cauldron", true, true, false, "Standard size for first-year students", "Cauldron", "Standard size for potion brewing.");
        Tool toolSilverKnife = new Tool("Silver Knife", true, false, false, "Useful for potion ingredient preparation", "Silver Knife", "Sharp knife made of silver for cutting potion ingredients.");

        // Ingredients
        Ingredient ingredientWolfsbane = new Ingredient("Wolfsbane", true, true, false, "Critical for brewing the Wolfsbane Potion", "Wolfsbane", 2.5, "grams");
        Ingredient ingredientUnicornHair = new Ingredient("Unicorn Hair", true, false, false, "Rare and powerful magical ingredient", "Unicorn Hair", 1.0, "strand");
        Ingredient ingredientLeeches = new Ingredient("Leeches", true, true, false, "Used in various potion recipes", "Leeches", 10.0, "pieces");
        Ingredient ingredientMoonstone = new Ingredient("Moonstone", true, true, false, "Enhances potion effects during a full moon", "Moonstone", 0.5, "ounces");
        Ingredient ingredientPowderedBicornHorn = new Ingredient("Powdered Bicorn Horn", true, true, false, "Common potion ingredient", "Powdered Bicorn Horn", 3.0, "grams");

        // Course materials
        TeachingMaterials[] coursePotionsMaterials = {toolCauldron, toolSilverKnife, ingredientPowderedBicornHorn, ingredientLeeches, ingredientMoonstone, ingredientWolfsbane, ingredientUnicornHair};

        // Course
        Course coursePotions = new Course(subjectPotions, headOfSlytherin, students1991, coursePotionsMaterials);

        // Add students to Student controller
        studentController.createStudent(harry);
        studentController.createStudent(hermione);
        studentController.createStudent(ronald);
        studentController.createStudent(luna);
        studentController.createStudent(draco);
        studentController.createStudent(cedric);
        studentController.createStudent(neville);
        studentController.createStudent(pansy);
        studentController.createStudent(cho);
        studentController.createStudent(cormac);
        studentController.createStudent(justin);
        studentController.createStudent(marietta);

        // Add teachers to Teacher controller
        teacherController.createTeacher(headmaster);
        teacherController.createTeacher(headOfGryffindor);
        teacherController.createTeacher(headOfHufflepuff);
        teacherController.createTeacher(headOfGryffindor);
        teacherController.createTeacher(headOfSlytherin);
    }
}
