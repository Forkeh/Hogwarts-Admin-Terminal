package edu.hogwarts;

public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student(int enrollmentYear, int graduationYear, boolean graduated) {
        super();
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(String lastName, String firstName, String middleName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(lastName, firstName, middleName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentYear=" + enrollmentYear +
                ", graduationYear=" + graduationYear +
                ", graduated=" + graduated +
                '}';
    }
}
