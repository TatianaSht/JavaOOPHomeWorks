package homework_03;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int index = 0;
    private List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return index < students.size();
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}
