package calculator;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    @Test
    public void shouldSumTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(7,3);
        assertEquals(10, result);

    }

    @Test
    public void shouldSubTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(5,3);
        assertEquals(2, result);

    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multply(3,3);
        assertEquals(9, result);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(8,2);
        assertEquals(4, result);
    }

}


