package homework_04;

public class Main {
    public static void main(String[] args) {

        TeacherController teacherController = new TeacherController();
        teacherController.create("Иванов", "Иван", "Иванович");
        teacherController.create("Петров", "Петр", "Петрович");
        teacherController.create("Маршак", "Самуил", "Яковлевич");
        System.out.println("Список учителей в системе:");
        teacherController.printAllTeachers();

        teacherController.teacherEditingById(1, "Иванов", "Семен", "Игоревич");
        System.out.println("Список учителей после изменения учителя c Id '1'");
        teacherController.printAllTeachers();
    }
}
