package homework_05;

import homework_05.controller.Controller;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Ст1", "Ст1", "Ст1");
        controller.createStudent("Ст2", "Ст2", "Ст2");
        controller.createStudent("Ст3", "Ст3", "Ст3");
        controller.createStudent("Ст4", "Ст4", "Ст4");
        controller.getAllStudent();
        controller.createTeacher("Уч1", "Уч1", "Уч1");
        controller.createTeacher("Уч2", "Уч2", "Уч2");
        controller.getAllTeacher();
        controller.createStudentsGroup(2, new ArrayList<>(Arrays.asList(2,3)));
        controller.printAllGroup();
    }
}
