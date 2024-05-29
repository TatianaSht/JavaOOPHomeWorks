package homework_07;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new FileLogger("src/homework_07/CalcLog.txt"));
        ViewCalculator viewCalculator = new ViewCalculator(calculableFactory);
        viewCalculator.run();
    }
}
