package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

import java.util.Arrays;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private Student[] students;
    private TeachingMaterials[] materials;

    public Course(Subject subject, Teacher teacher, Student[] students, TeachingMaterials[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public TeachingMaterials[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterials[] materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", students=" + Arrays.toString(students) +
                ", materials=" + Arrays.toString(materials) +
                '}';
    }
}
