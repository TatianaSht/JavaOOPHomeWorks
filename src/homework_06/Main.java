package homework_06;

import homework_06.work1.refactor.Rectangle;
import homework_06.work1.refactor.Square;
import homework_06.work3.refactor.*;


public class Main {

    public static void main(String[] args) {

        // Test work 1
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(20, 10);

        System.out.println(square.area());
        System.out.println(rectangle.area());
        System.out.println("================================================");

        // Test work 3
        CasualGreeting casual = new CasualGreeting();
        FormalGreeting formal = new FormalGreeting();
        IntimateGreeting intimate = new IntimateGreeting();
        NoPersonalityGreeting noPerson = new NoPersonalityGreeting();

        Greeter greeter1 = new Greeter(casual);
        Greeter greeter2 = new Greeter(formal);
        Greeter greeter3 = new Greeter(intimate);
        Greeter greeter4 = new Greeter(noPerson);
        System.out.println(greeter1.phrases());
        System.out.println(greeter2.phrases());
        System.out.println(greeter3.phrases());
        System.out.println(greeter4.phrases());
    }
}
