package edu.knoldus;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Neelaksh on 18/8/17.
 */
public class CalculatorTest {
    Calculator testCalculator = new Calculator();
    @Test
    public void testAdd() throws Exception {
        assertEquals(testCalculator.add(5,6),11);
    }

}
