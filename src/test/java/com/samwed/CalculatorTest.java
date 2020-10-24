package com.samwed;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator(8, 0);

    @Test
    public void testGetSubtract() throws Exception
    {
        assertEquals(8, calculator.getSubtract());
    }

    @Test
    public void testGetSum() throws Exception
    {
        assertEquals(8, calculator.getSum());
    }

    @Test
    public void testGetDivide() throws Exception
    {
        assertEquals(0, calculator.getDivide());
    }

    @Test(expected = ArithmeticException.class)
    public void testGetDivideException() throws Exception
    {
       calculator.getDivide();
    }

    @Test
    public void testGetMultiply() throws Exception
    {
        assertEquals(0, calculator.getMultiple());
    }

}
