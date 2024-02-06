package edu.generic;

import java.util.UUID;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private final UUID id;



    public Person() {
        this.id = UUID.randomUUID();
    }

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.id = UUID.randomUUID();
    }
    public Person(String firstName, String lastName) {
        this(firstName, lastName, "-Intet mellemnavn-");
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

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}
