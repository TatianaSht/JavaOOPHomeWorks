package homework_05.model;

import java.util.List;

public class StudentsGroup {
    private Teacher teacher;
    private List<Student> studentList;


    public StudentsGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }


    public Teacher getTeacher() {
        return teacher;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public List<Student> getStudentList() {
        return studentList;
    }


    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


    @Override
    public String toString() {
        return "Группа студентов\nУчитель:\n" + teacher + "\nСтуденты: \n" + studentList;
    }
}


