import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {

    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumWithOneNumber() {
        assertEquals(1, calculator.sum(1));
    }

    @Test
    public void testSumWithThreeNumbers() {
        assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testSumWithZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.sum(0);
        });
    }
}