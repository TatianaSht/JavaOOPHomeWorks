package homework_07;

public interface Calculable {
    Calculable addition(double numReArg2, double numImArg2);
    Calculable multiplication(double numReArg2, double numImArg2);
    Calculable division(double numReArg2, double numImArg2);
    double getNumReArg1();
    double getNumImArg1();
}

