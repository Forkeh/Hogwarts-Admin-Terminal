import edu.hogwarts.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        initApp();
    }

    static void initApp() {
        System.out.println("Hogwarts School app start!");

        // Houses
        House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red", "Gold"});
        House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"});
        House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Silver"});
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});

        // Teachers
        HogwartsTeacher slughorn = new HogwartsTeacher("Horace", "Slughorn", "Potions Master", LocalDate.of(1981, 9, 1), null, slytherin, false);
        HogwartsTeacher snape = new HogwartsTeacher("Severus", "Snape", "Potions Master", LocalDate.of(1996, 9, 1), LocalDate.of(1997, 6, 30), slytherin, true);

        // Students
        HogwartsStudent harry = new HogwartsStudent("Harry", "Potter", "James", 1991, 1998, true, gryffindor, true, new String[]{"Quidditch"});
        HogwartsStudent hermione = new HogwartsStudent("Hermione", "Granger", "Jean", 1991, 1998, true, gryffindor, true, new String[]{"Wizard Chess"});
        HogwartsStudent ronald = new HogwartsStudent("Ronald", "Weasley", "Bilius", 1991, 1998, true, gryffindor, false, new String[]{"Wizard Chess", "Quidditch"});
        HogwartsStudent ginny = new HogwartsStudent("Ginny", "Weasley", "Molly", 1991, 1999, true, gryffindor, false, new String[]{"Quidditch"});
        HogwartsStudent luna = new HogwartsStudent("Luna", "Lovegood", 1991, 1999, true, ravenclaw, false, new String[]{"Magical Creatures"});
        HogwartsStudent draco = new HogwartsStudent("Draco", "Malfoy", "Lucius", 1991, 1998, true, slytherin, true, new String[]{"Quidditch"});
        HogwartsStudent cedric = new HogwartsStudent("Cedric", "Diggory", 1991, 2000, true, hufflepuff, true, new String[]{"Quidditch"});

        // Year group
        Student[] students1991 = {harry, hermione, ronald, ginny, luna, draco, cedric};
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
        Course coursePotions = new Course(subjectPotions, slughorn, students1991, coursePotionsMaterials);
    }

}