package homework_01;

import java.util.List;

public class HotDrinkVendingMachine implements  VendingMachine{
    private List<HotDrinks> hotDrinksList;

    public HotDrinkVendingMachine(List<HotDrinks> hotDrinksList) {
        this.hotDrinksList = hotDrinksList;
    }


    @Override
    public Product getProduct(String name) {
        for (Product product : hotDrinksList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public HotDrinks getProduct(String name, double price, int volume, int temperature) {
        for (HotDrinks hotDrinks : hotDrinksList) {
            if (hotDrinks.getName().equals(name) &&
                    hotDrinks.getPrice() == price &&
                    hotDrinks.getTemperature() == temperature) {
                return hotDrinks;
            }
        }
        return null;
    }

    public void addProduct(HotDrinks hotDrinks){
        hotDrinksList.add(hotDrinks);
    }

}
