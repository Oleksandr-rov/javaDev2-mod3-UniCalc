package org.unicalc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class UniCalcMathTest {
    @Test
    public void testAddInt() {
        //Given
        UniCalc calc = new UniCalc();

        //When
        int result = calc.add(1, 2);

        //Then
        int expected = 3;
        assertEquals(expected, result);
    }
    @Test
    public void testAddFloat() {
        //Given
        UniCalc calc = new UniCalc();

        //When
        int result = calc.add(1f, 2f);

        //Then
        int expected = 3;
        assertEquals(expected, result);
    }

    @Test
    public void testDivInt() {
        //Given
        UniCalc calc = new UniCalc();

        //When
        int result = calc.div(1, 2);

        //Then
        int expected = 0;
        assertEquals(expected, result);
    }
    @Test
    public void testDivByZeroInt() {
        //Given
        UniCalc calc = new UniCalc();
        //Then
        int expected = 3;
        assertThrows(IllegalArgumentException.class,
                () -> calc.div(1, 0));
    }
    @Test
    public void testDivFloat() {
        //Given
        UniCalc calc = new UniCalc();

        //When
        int result = calc.div(1f, 2f);

        //Then
        int expected = Math.round(1f / 2f);
        assertEquals(expected, result);
    }
    @Test
    public void testDivByZeroFloat() {
        //Given
        UniCalc calc = new UniCalc();

        //Then
        int expected = 3;
        assertThrows(IllegalArgumentException.class,
                () -> calc.div(1f, 0f));
    }
}
