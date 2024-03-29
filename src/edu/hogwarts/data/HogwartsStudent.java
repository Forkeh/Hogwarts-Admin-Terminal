package edu.hogwarts.data;

import edu.generic.Student;

import java.time.LocalDate;
import java.util.Arrays;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent() {
    }

    public HogwartsStudent(String firstName, String lastName, String middleName, LocalDate birthYear, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(firstName, lastName, middleName, birthYear, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public HogwartsStudent(String firstName, String lastName, LocalDate birthYear, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(firstName, lastName, birthYear, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public House getHouse() {
        return this.house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - HogwartsStudent{" +
                "house=" + house +
                ", prefect=" + prefect +
                ", teams=" + Arrays.toString(teams) +
                '}';
    }
}
