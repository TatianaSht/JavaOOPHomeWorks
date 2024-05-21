package homework_03;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup("M-5034");
        StudentGroup studentGroup2 = new StudentGroup("N-8421");
        StudentGroup studentGroup3 = new StudentGroup("D-6912");
        StudentGroup studentGroup4 = new StudentGroup("O-3345");
        StudentGroup studentGroup5 = new StudentGroup("A-1287");
        StudentGroup studentGroup6 = new StudentGroup("G-1564");
        StudentGroup studentGroup7 = new StudentGroup("W-3975");
        StudentGroup studentGroup8 = new StudentGroup("S-4486");
        StudentGroup studentGroup9 = new StudentGroup("L-7748");



        Stream stream1 = new Stream("Поток № 1");
        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);

        Stream stream2 = new Stream("Поток № 2");
        stream2.addStudentGroup(studentGroup4);
        stream2.addStudentGroup(studentGroup5);

        Stream stream3 = new Stream("Поток № 3");
        stream3.addStudentGroup(studentGroup6);
        stream3.addStudentGroup(studentGroup7);
        stream3.addStudentGroup(studentGroup8);
        stream3.addStudentGroup(studentGroup9);



        TreeSet<Stream> streamSet = new TreeSet<>(new StreamComparator());
        streamSet.add(stream1);
        streamSet.add(stream2);
        streamSet.add(stream3);


        System.out.println("Список потоков, отсортированный по количеству групп:");

        for (Stream stream : streamSet) {
            System.out.println(stream.getStreamName() + ", групп: " + stream.getSize());
        }
    }
}
