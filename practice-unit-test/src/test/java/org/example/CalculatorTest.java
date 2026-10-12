package org.example;

//import org.junit.jupiter.api.Test;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public  void testAdd() {
        Calculator calculator = new Calculator();
        int expectedResult1= calculator.add(2, 5);
        assertEquals(7,expectedResult1,"happyPath");
        int expectedResult2= calculator.add(0, -1);
        assertEquals(-1,expectedResult2,"edgeCase");
        int expectedResult3= calculator.add(0, 0);
        assertEquals(0,expectedResult3,"unusualInput");

    }

    @Test
    public  void testSubtract() {
        Calculator calculator = new Calculator();
        int expectedResult1= calculator.subtract(8, 5);
        assertEquals(3,expectedResult1,"happyPath");
        int expectedResult2= calculator.subtract(-2, 1);
        assertEquals(-3,expectedResult2,"edgeCase");
        int expectedResult3= calculator.subtract(0, 0);
        assertEquals(0,expectedResult3,"unusualInput");

    }

    @Test
    public  void testMultiply() {
        Calculator calculator = new Calculator();
        int expectedResult1= calculator.multiply(8, 5);
        assertEquals(40,expectedResult1,"happyPath");
        int expectedResult2= calculator.multiply(-2, 1);
        assertEquals(-2,expectedResult2,"unusualInput");
        int expectedResult3= calculator.multiply(0, 1);
        assertEquals(0,expectedResult3,"edgeCase");

    }

    @Test
    public  void testDivide() {
        Calculator calculator = new Calculator();
        int expectedResult1= calculator.divide(8, 2);
        assertEquals(4,expectedResult1,"happyPath");
        assertThrows(ArithmeticException.class, () -> { calculator.divide( 4,  0); });
        int expectedResult3= calculator.divide(0, 1);
        assertEquals(0,expectedResult3,"edgeCase");

    }


}
