package homework_03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream>{

    @Override
    public int compare(Stream stream1, Stream stream2) {
        if (stream1.getSize() == stream2.getSize()) {
            return 0;
        } else if (stream1.getSize() > stream2.getSize()) {
            return 1;
        } else {
            return -1;
        }
    }
}
