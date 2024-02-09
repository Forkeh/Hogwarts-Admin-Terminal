package edu.generic;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private final UUID id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthYear;


    public Person() {
        this.id = UUID.randomUUID();
    }

    public Person(String firstName, String lastName, String middleName, LocalDate birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = UUID.randomUUID();
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName, LocalDate birthYear) {
        this(firstName, lastName, "x", birthYear);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        var today = LocalDate.of(1992, 1, 1);
        return this.birthYear.until(today).getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
