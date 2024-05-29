package homework_07;

public class LogCalculableFactory implements ICalculableFactory{
    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(double numReArg2, double numImArg2) {
        return new LogCalculator(new Calculator(numReArg2, numImArg2), logger);
    }
}
