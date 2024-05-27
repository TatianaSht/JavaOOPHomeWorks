package homework_05.model;

abstract public class User {
    private String lastName;
    private String firstName;
    private String surName;

    public User(String lastName, String firstName, String surName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurNameName(String surName) {
        this.surName = surName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                ", фамилия='" + lastName + '\'' +
                ", имя='" + firstName + '\'' +
                ", отчество='" + surName + '\'' +
                '}';
    }
}
