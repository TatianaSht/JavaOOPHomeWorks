package homework_04;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public void create(String firstName, String lastName, String surName) {
        int maxId = 0;
        for (Teacher teacher : teachers) {
            if (maxId < teacher.getTeacherId()){
                maxId = teacher.getTeacherId();
            }
        }
        Teacher teacher = new Teacher(firstName, lastName, surName, ++maxId);
        teachers.add(teacher);
    }

    public void teacherEditingById (Integer teacherId, String lastName, String firstName, String surName) {
        for (Teacher teacher: teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setLastName(lastName);
                teacher.setFirstName(firstName);
                teacher.setSurName(surName);
            }
        }
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
}
