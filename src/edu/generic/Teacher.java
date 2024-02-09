package edu.generic;

import java.time.LocalDate;

public class Teacher extends Person {
    private String employment;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, String middleName, LocalDate birthYear, String employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, lastName, middleName, birthYear);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public Teacher(String firstName, String lastName, LocalDate birthYear, String employment, LocalDate employmentStart, LocalDate employmentEnd) {
        super(firstName, lastName, "x", birthYear);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - Teacher{" +
                "employment='" + employment + '\'' +
                ", employmentStart=" + employmentStart +
                ", employmentEnd=" + employmentEnd +
                '}';
    }


}
