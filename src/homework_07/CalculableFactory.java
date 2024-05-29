package homework_07;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(double numReArg2, double numImArg2) {
        return new Calculator(numReArg2, numImArg2);
    }
}
