package homework_05.model;

public class Student extends User {

    private Integer studentId;

    public Student(String lastName, String firstName, String surName, Integer studentId) {
        super(lastName, firstName, surName);
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student {" +
                "Id=" + studentId +
                ", фамилия='" + super.getLastName() + '\'' +
                ", имя='" + super.getFirstName() + '\'' +
                ", отчество='" + super.getSurName() + '\'' +
                '}';
    }
}
