package edu.hogwarts.data;

import edu.generic.Teacher;

import java.time.LocalDate;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher() {
    }

    public HogwartsTeacher(String firstName, String lastName, String middleName, LocalDate birthYear, String employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, middleName, birthYear, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String lastName, LocalDate birthYear, String employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, birthYear, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public House getHouse() {
        return this.house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
