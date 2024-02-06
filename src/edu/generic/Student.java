package edu.generic;

import edu.generic.Person;

public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student() {super();}

    public Student(String firstName, String lastName, String middleName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(firstName, lastName, middleName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }
    public Student(String firstName, String lastName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(firstName, lastName, "-Intet mellemnavn-");
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Student{" +
                "enrollmentYear=" + enrollmentYear +
                ", graduationYear=" + graduationYear +
                ", graduated=" + graduated +
                '}';
    }
}
