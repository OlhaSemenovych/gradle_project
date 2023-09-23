import module2.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    @Order(1)
    void positiveNumbersCanBeSumWhenIntIsOneTest() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    @Order(2)
    void positiveNumbersCanBeSumWhenIntIsThreeTest() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    @Order(3)
    void negativeNumbersCanBeSumWhenIntIsMinusOneTest() {
        assertEquals(-1, sumCalculator.sum(-1));
    }

    @Test
    @Order(4)
    void negativeNumbersCanBeSumWhenIntIsMinusThreeTest() {
        assertEquals(-6, sumCalculator.sum(-3));
    }

    @Test
    @Order(5)
    void sumThrowIllegalArgumentExceptionForZeroValueTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }

    //test commit changes

}
