package edu.hogwarts.application;

import edu.generic.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class TeacherController {

    HashMap<UUID, Teacher> teachersMap;

    public TeacherController() {
        this.teachersMap = new HashMap<>();
    }


    public void createTeacher(Teacher teacher) {
        this.teachersMap.put(UUID.randomUUID(), teacher);
    }

    public Teacher getTeacher(UUID id) {
        return teachersMap.get(id);
    }

    public List<Teacher> getAllTeachers() {

        return new ArrayList<Teacher>(this.teachersMap.values());
    }

    public void updateTeacher(UUID id, Teacher teacher) {
        this.teachersMap.put(id, teacher);
    }

    public void deleteTeacher(UUID id) {
        this.teachersMap.remove(id);
    }
}
