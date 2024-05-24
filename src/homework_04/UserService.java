package homework_04;

import java.util.List;

public interface UserService<T extends User> {

    void create(String lastName, String firstName, String surName);
    List<T> getAll();

}
