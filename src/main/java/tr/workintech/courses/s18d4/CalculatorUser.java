package tr.workintech.courses.s18d4;

public class CalculatorUser {

    private final Calculator calculator;

    public CalculatorUser(Calculator calculator) {
        this.calculator = calculator;
    }

    public int doSomething(int x, int y) {

        return calculator.divide(calculator.sum(x, y), x);
    }
}
