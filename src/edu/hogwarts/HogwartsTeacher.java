package edu.hogwarts;

public class HogwartsTeacher extends Person implements HogwartsPerson{
    House house;
    boolean headOfHouse;

    public HogwartsTeacher() {
        super();
    }

    public HogwartsTeacher(String firstName, String lastName, String middleName, House house, boolean headOfHouse) {
        super(firstName, lastName, middleName);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public HogwartsTeacher(String firstName, String lastName, House house, boolean headOfHouse) {
        super(firstName, lastName);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }
}
