package homework_07;

public class Calculator implements Calculable{
    private double numReArg1;
    private double numImArg1;

    public Calculator(double numReArg1, double numImArg1) {
        this.numReArg1 = numReArg1;
        this.numImArg1 = numImArg1;
    }

    @Override
    public Calculable addition(double numReArg2, double numImArg2) {
        this.numReArg1 += numReArg2;
        this.numImArg1 += numImArg2;
        return this;
    }

    @Override
    public Calculable multiplication(double numReArg2, double numImArg2) {
        double tempReal = this.numReArg1;
        this.numReArg1 = this.numReArg1 * numReArg2 - this.numImArg1 * numImArg2;
        this.numImArg1 = tempReal * numImArg2 + this.numImArg1 * numReArg2;
        return this;
    }

    @Override
    public Calculable division(double numReArg2, double numImArg2) {
        this.numReArg1 /= numReArg2;
        this.numImArg1 /= numImArg2;
        return this;
    }

    @Override
    public double getNumReArg1() {
        return numReArg1;
    }

    @Override
    public double getNumImArg1() {
        return numImArg1;
    }
}
