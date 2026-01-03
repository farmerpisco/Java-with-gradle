// src/test/java/com/example/CalculatorTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-10, calculator.subtract(-5, 5));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(1.666666, calculator.divide(5, 3), 0.00001);
    }
    
    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5, 0);
        });
    }
}
