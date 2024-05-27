package homework_02;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Buyer buyer);

    void releaseFromMarket(List<Buyer> buyersList);

    void update();
}
