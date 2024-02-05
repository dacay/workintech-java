package tr.workintech.courses.s18d4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorUserTest {

    @Test
    void doSomething() {

        Calculator calculator = mock(Calculator.class);

        CalculatorUser user = new CalculatorUser(calculator);

        user.doSomething(3, 4);

        verify(calculator).sum(3, 4);
        verify(calculator).divide(anyInt(), anyInt());
    }
}