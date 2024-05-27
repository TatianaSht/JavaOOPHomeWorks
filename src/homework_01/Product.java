package homework_01;

public abstract class Product {
    private String name;
    private double price;
    private int volume;

    public Product(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Product: " + getName() + ", \tprice " + getPrice() + "р." + "\tvolume " + getVolume() + "мл.";
    }
}
