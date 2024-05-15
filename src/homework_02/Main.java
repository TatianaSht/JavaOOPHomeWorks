package homework_02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Иван");

        market.acceptToMarket(human1);
        market.update();
    }
}
