package homework_05.service;

import homework_05.model.Student;
import homework_05.model.StudentsGroup;
import homework_05.model.Teacher;

import java.util.List;

public class StudentsGroupService {
    private StudentsGroup studentsGroup;

    public void createStudyGroups(Teacher teacher, List<Student> students){
        this.studentsGroup = new StudentsGroup(teacher, students);
    }

    public StudentsGroup getStudentsGroup() {
        return studentsGroup;
    }
}
