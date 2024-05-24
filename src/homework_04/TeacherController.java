package homework_04;

import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    private List<Teacher> teachersList = new ArrayList<>();

    @Override
    public void create(String lastName, String firstName, String surName) {
        teacherService.create(lastName, firstName, surName);
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAll();
    }

    public void printAllTeachers(){
        teacherView.sendOnConsole(getAllTeachers());
    }

    public void teacherEditingById(Integer teacherId, String lastName, String firstName, String surName){
        teacherService.teacherEditingById(teacherId, lastName, firstName, surName);
    }
}
