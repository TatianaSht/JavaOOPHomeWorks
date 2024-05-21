package homework_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream> {

    private String streamName;
    private List<StudentGroup> studentsGroups;

    public Stream(String streamName) {
        this.streamName = streamName;
        this.studentsGroups = new ArrayList<>();
    }

    public String getStreamName() {
        return this.streamName;
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentsGroups.add(studentGroup);
    }

    public int getSize() {
        return studentsGroups.size();
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator();
    }

    private class StreamIterator implements Iterator<StudentGroup> {

        private int index = 0;

        public boolean hasNext() {
            return index < studentsGroups.size();
        }

        public StudentGroup next() {
            return studentsGroups.get(index++);
        }
    }

    @Override
    public int compareTo(Stream stream) {
        if (this.getSize() == stream.getSize()) {
            return 0;
        } else if (this.getSize() > stream.getSize()) {
            return 1;
        } else {
            return -1;
        }
    }
}
