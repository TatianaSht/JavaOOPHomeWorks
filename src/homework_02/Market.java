package homework_02;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private final List<Buyer> buyersQueueList;

    public Market() {
        this.buyersQueueList = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Buyer buyer) {
        System.out.println("Visitor: " + buyer.getName() + "\tstate: зашел в магазин");
        takeInQueue(buyer);
    }

    @Override
    public void takeInQueue(Buyer buyer) {
        System.out.println("Visitor: " + buyer.getName() + "\tstate: встал в очередь");
        buyersQueueList.add(buyer);
    }

    @Override
    public void takeOrders() {
        for (Buyer buyer : buyersQueueList){
            if (!buyer.isMakeOrder()){
                buyer.setMakeOrder(true);
                System.out.println("Visitor: " + buyer.getName() + "\tstate: оформил заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Buyer buyer : buyersQueueList){
            if (buyer.isMakeOrder()){
                buyer.setTakeOrder(true);
                System.out.println("Visitor: " + buyer.getName()  + "\tstate: получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Buyer> actorList = new ArrayList<>();
        for (Buyer buyer : buyersQueueList){
            if (buyer.isTakeOrder()){
                actorList.add(buyer);
                System.out.println("Visitor: " + buyer.getName()  + "\tstate: вышел из очереди");
            }
        }
        releaseFromMarket(actorList);
    }

    @Override
    public void releaseFromMarket(List<Buyer> buyerList) {
        for (Buyer buyer : buyerList){
            System.out.println("Visitor: " + buyer.getName() + "\tstate: покинул магазин");
            buyersQueueList.remove(buyer);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}
