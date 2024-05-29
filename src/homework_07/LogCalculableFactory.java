package homework_07;

public class LogCalculableFactory implements ICalculableFactory{
    private Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(double realArg2, double imagArg2) {
        return new LogCalculator(new Calculator(realArg2, imagArg2), logger);
    }
}
