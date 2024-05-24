package homework_04;

public class Teacher extends User {
    private Integer teacherId;

    public Teacher(String lastName, String firstName, String surName, Integer teacherId) {
        super(lastName, firstName, surName);
        this.teacherId = teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setLastName(String lastName){
        super.setLastName(lastName);
    }

    public void setFirstName(String firstName){
        super.setFirstName(firstName);
    }

    public void setSurName(String surName){
        super.setSurName(surName);
    }

    @Override
    public String toString() {
        return "Teacher: " + "Id=" + getTeacherId() + "\t" +  super.toString();
    }

}
