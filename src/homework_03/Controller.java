package homework_03;

import java.util.List;

public class Controller {
    private StreamService streamService;

    public void getSortedStreams(List<Stream> streams) {
        streamService = new StreamService();
        streamService.streamSorting(streams);
    }
}
