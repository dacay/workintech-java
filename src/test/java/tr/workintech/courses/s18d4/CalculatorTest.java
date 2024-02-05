package tr.workintech.courses.s18d4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {

        int x = 7;
        int y = 3;

        int result = new Calculator().sum(x, y);

        // .equals -> Java'da esitlik

        assertEquals(x + y, result);
    }

    @Test
    void multiply() {

        int x = 5;
        
        int y = 4;

        int result = new Calculator().multiply(x, y);

        assertEquals(20, result);
    }


    @Test
    void divideByZero() {

        int x = 8;
        int y = 0;

        int result = new Calculator().divide(x, y);

        assertEquals(0, result);
    }

    @Test
    void substract() {

        int x = 8;
        int y = 4;

        int result = new Calculator().substract(x, y);

        assertEquals(4, result);
    }
}