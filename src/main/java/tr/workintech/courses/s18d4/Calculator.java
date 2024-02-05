package tr.workintech.courses.s18d4;

public class Calculator {

    public Calculator() {
    }

    public int sum(int x, int y) {

        return x + y;
    }

    public int multiply(int x, int y) {

        return x * y;
    }

    public int divide(int x, int y) {

        if (y == 0)
            return 0;

        return x / y;
    }

    public int substract(int x, int y) {

        return x - y;
    }
}
