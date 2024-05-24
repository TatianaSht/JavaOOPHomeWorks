package homework_05.controller;

import homework_05.model.Student;
import homework_05.model.Teacher;
import homework_05.model.Type;
import homework_05.model.User;
import homework_05.service.DataService;
import homework_05.service.StudentsGroupService;
import homework_05.view.StudentView;
import homework_05.view.StudentsGroupView;
import homework_05.view.TeacherView;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentsGroupService studentsGroupService = new StudentsGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentsGroupView studentsGroupView = new StudentsGroupView();


    public void createStudent(String lastName, String firstName, String surName){
        dataService.create(lastName, firstName, surName, Type.STUDENT);
    }


    public void createTeacher(String lastName, String firstName, String surName){
        dataService.create(lastName, firstName, surName, Type.TEACHER);
    }


    public void getAllStudent(){
        List<Student> userList = dataService.getAllStudent();
        System.out.println("Список студентов:");
        for (User user : userList){
            studentView.printOnConsole((Student) user);
        }
    }

    public void getAllTeacher(){
        List<Teacher> userList = dataService.getAllTeacher();
        System.out.println("Список учителей:");
        for (User user : userList){
            teacherView.printOnConsole((Teacher) user);
        }
    }

    public void createStudentsGroup(Integer teacherId, List<Integer> studentId){
        Teacher teacher = dataService.getTeacherById(teacherId, dataService.getAllTeacher());
        List<Student> students = dataService.getStudentsById(studentId);
        studentsGroupService.createStudyGroups(teacher, students);
    }

    public void printAllGroup(){
        studentsGroupView.printOnConsole(studentsGroupService.getStudentsGroup());
    }
}
