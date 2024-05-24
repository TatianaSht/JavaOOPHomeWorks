package homework_05.model;

public class Teacher extends User{

    private Integer teacherId;

    public Teacher(String lastName, String firstName, String surName, Integer teacherId) {
        super(lastName, firstName, surName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher {"+
                "Id=" + teacherId +
                ", фамилия='" + super.getLastName() + '\'' +
                ", имя='" + super.getFirstName() + '\'' +
                ", отчество='" + super.getSurName() + '\'' +
                '}';
    }
}




