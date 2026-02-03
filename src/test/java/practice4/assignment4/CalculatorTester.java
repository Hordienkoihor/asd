package practice4.assignment4;

import org.junit.Test;

public class CalculatorTester {
    @Test
    public void testDivideCorrect() {
        Calculator calc = new Calculator();

        assert calc.divide(10, 5) == 2;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideIncorrect() {
        Calculator calc = new Calculator();

        assert calc.divide(9, 0) == 100;
    }
}
