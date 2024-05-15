package homework_02;

public abstract class Buyer implements BuyerBehaviour {
    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected Buyer(String name) {
        this.name = name;
    }

    public abstract String getName();
}
