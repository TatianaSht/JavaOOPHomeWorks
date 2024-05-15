package homework_02;

public interface QueueBehaviour {

    void takeInQueue(Buyer buyer);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
