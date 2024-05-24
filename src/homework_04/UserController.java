package homework_04;

public interface UserController<T extends User> {

    void create(String lastName, String firstName, String surName);
}
