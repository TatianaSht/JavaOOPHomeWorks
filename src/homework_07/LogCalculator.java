package homework_07;

public class LogCalculator implements Calculable{
    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public double getNumReArg1() {
        double result = decorated.getNumReArg1();
        return result;
    }

    @Override
    public double getNumImArg1() {
        double result = decorated.getNumImArg1();
        return result;
    }

    @Override
    public Calculable addition(double numReArg2, double numImArg2) {
        double numReArg1 = decorated.getNumReArg1();
        double numImArg1 = decorated.getNumImArg1();
        logger.log("Первое комплексное число: (" + numReArg1 + " + " + numImArg1 + "i)");
        logger.log("Начало вызова метода addition со вторым комплексным числом: (" + numReArg2 + " + " + numImArg2 + "i)");
        Calculable result = decorated.addition(numReArg2, numImArg2);
        logger.log("Вызов метода addition произошел успешно");
        logger.log("Результат метода addition: (" + getNumReArg1() + " + " + getNumImArg1() + "i)");
        logger.log("-----------------------------");
        return result;
    }

    @Override
    public Calculable multiplication(double numReArg2, double numImArg2) {
        double numReArg1 = decorated.getNumReArg1();
        double numImArg1 = decorated.getNumImArg1();
        logger.log("Первое комплексное число: (" + numReArg1 + " + " + numImArg1 + "i)");
        logger.log("Начало вызова метода multiplication со вторым комплексным числом: (" + numReArg2 + " + " + numImArg2 + "i)");
        Calculable result = decorated.multiplication(numReArg2, numImArg2);
        logger.log("Вызов метода multiplication произошел успешно");
        logger.log("Результат метода multiplication: (" + getNumReArg1() + " + " + getNumImArg1() + "i)");
        logger.log("-----------------------------");
        return result;
    }

    @Override
    public Calculable division(double numReArg2, double numImArg2) {
        double numReArg1 = decorated.getNumReArg1();
        double numImArg1 = decorated.getNumImArg1();
        logger.log("Первое комплексное число: (" + numReArg1 + " + " + numImArg1 + "i)");
        logger.log("Начало вызова метода division со вторым комплексным числом: (" + numReArg2 + " + " + numImArg2 + "i)");
        Calculable result = decorated.division(numReArg2, numImArg2);
        logger.log("Вызов метода division произошел успешно");
        logger.log("Результат метода division: (" + getNumReArg1() + " + " + getNumImArg1() + "i)");
        logger.log("-----------------------------");
        return result;
    }
}
