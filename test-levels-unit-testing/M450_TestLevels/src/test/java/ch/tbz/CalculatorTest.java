package test.java.ch.tbz;

import main.java.ch.tbz.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calc.add(2, 3), 0.0001);
        assertEquals(-1.0, calc.add(-2, 1), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calc.subtract(3, 2), 0.0001);
        assertEquals(-5.0, calc.subtract(-2, 3), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calc.multiply(2, 3), 0.0001);
        assertEquals(0.0, calc.multiply(5, 0), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6, 3), 0.0001);
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}

