package homework_01;

public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ",\theat " + getTemperature() + " град.";
    }
}
