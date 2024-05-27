package homework_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private String groupName;
    private List<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator();
    }

    private class StudentGroupIterator implements Iterator<Student> {

        private int index = 0;

        public boolean hasNext() {
            return index < students.size();
        }

        public Student next() {
            return students.get(index++);
        }
    }
}
