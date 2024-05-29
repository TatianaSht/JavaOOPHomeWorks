package homework_07;

import java.util.Scanner;

public class ViewCalculator {
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            System.out.println("Ввод первого комплексного числа");
            double numReArg1 = doubleNum("Действительная часть: ");
            double numImArg1 = doubleNum("Мнимая часть: ");
            Calculable calculator = calculableFactory.create(numReArg1, numImArg1);
            while (true) {
                String cmd = str("Введите операцию (+, *, /, = ): ");
                if (cmd.equals("*")) {
                    System.out.println("Ввод второго комплексного числа");
                    double numReArg2 = doubleNum("Действительная часть: ");
                    double numImArg2 = doubleNum("Мнимая часть: ");
                    calculator.multiplication(numReArg2, numImArg2);
                    continue;
                }
                if (cmd.equals("+")) {
                    double numReArg2 = doubleNum("Действительная часть: ");
                    double numImArg2 = doubleNum("Мниммая часть: ");
                    calculator.addition(numReArg2, numImArg2);
                    continue;
                }

                if (cmd.equals("/")) {
                    double numReArg2 = doubleNum("Действительная часть: ");
                    double numImArg2 = doubleNum("Мнимая часть: ");
                    calculator.division(numReArg2, numImArg2);
                    continue;
                }
                if (cmd.equals("=")) {
                    double resultRe = calculator.getNumReArg1();
                    double resultIm = calculator.getNumImArg1();
                    System.out.println("Получен результат: " + resultRe + " + " +  resultIm + "i");
                    break;
                }
            }
            String cmd = str("Еще посчитать? (Y/N)?");
            if (!cmd.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    private String str(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double doubleNum(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }

}
