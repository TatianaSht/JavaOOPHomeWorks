package homework_05.service;

import homework_05.model.Student;
import homework_05.model.Teacher;
import homework_05.model.Type;
import homework_05.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList = new ArrayList<>();;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }

    private int getFreeId(Type type){
        Integer lastId = 1;
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentId() + 1;
            }
        }
        return lastId;
    }

    public void create(String lastName, String firstName, String surName, Type type){
        int id = getFreeId(type);
        if (type == Type.STUDENT){
            Student student = new Student(lastName, firstName, surName, id);
            userList.add(student);
        }
        if (type == Type.TEACHER){
            Teacher teacher = new Teacher(lastName, firstName, surName, id);
            userList.add(teacher);
        }
    }

    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Student){
                studentList.add((Student) user);
            }
        }
        return studentList;
    }

    public List<Teacher> getAllTeacher(){
        List<Teacher> teacherList = new ArrayList<>();
        for (User user : userList){
            if (user instanceof Teacher){
                teacherList.add((Teacher)user);
            }
        }
        return teacherList;
    }

    public Teacher getTeacherById(Integer teacherId, List<Teacher> teachers){
        for (Teacher teacher : teachers){
            if (teacherId.equals(teacher.getTeacherId())){
                return teacher;
            }
        }
        return null;
    }

    public List<Student> getStudentsById(List<Integer> studentsListId){
        List<Student> students = new ArrayList<>();
        for (Student student : getAllStudent()){
            for (Integer i : studentsListId){
                if (student.getStudentId().equals(i)){
                    students.add(student);
                }
            }
        }
        return students;
    }
}
