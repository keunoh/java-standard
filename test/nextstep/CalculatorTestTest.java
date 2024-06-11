package nextstep;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTestTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(6, 3));
        assertEquals(9, calculator.add(6, 3));
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(6, 3));
        assertEquals(3, calculator.subtract(6, 3));
    }
}