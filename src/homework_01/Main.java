package homework_01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<HotDrinks> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrinks("Чай Almafood", 50, 200, 90));
        hotDrinks.add(new HotDrinks("Кофе Latte", 80, 150, 70));
        hotDrinks.add(new HotDrinks("Грог Classic", 85, 200, 80));
        hotDrinks.add(new HotDrinks("Баунти RAF", 100, 150, 60));

        System.out.println("*******************");
        System.out.println("Ассортимент автомата горячих напитков:");
        for (Product element : hotDrinks) {System.out.println(element);}
        System.out.println("****************");

        HotDrinkVendingMachine dispensingHotDrink = new HotDrinkVendingMachine(hotDrinks);
        System.out.println("Выбран для покупки горячий напиток:");
        System.out.println(dispensingHotDrink.getProduct("Кофе Latte",80, 150, 70));
        System.out.println("****************");
    }
}