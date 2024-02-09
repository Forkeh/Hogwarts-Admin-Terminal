package edu.hogwarts.application;

import edu.generic.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class StudentController {

    HashMap<UUID, Student> studentsMap;

    public StudentController() {
        this.studentsMap = new HashMap<>();
    }


    public void createStudent(Student student) {
        studentsMap.put(UUID.randomUUID(), student);
    }

    public Student getStudent(UUID id) {

        return studentsMap.get(id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<Student>(this.studentsMap.values());
    }

    public void updateStudent(UUID id, Student student) {
        studentsMap.put(id, student);
    }

    public void deleteStudent(UUID id) {
        studentsMap.remove(id);
    }
}
