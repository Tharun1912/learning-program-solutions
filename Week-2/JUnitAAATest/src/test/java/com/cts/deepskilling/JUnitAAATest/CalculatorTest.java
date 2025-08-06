package com.cts.deepskilling.JUnitAAATest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance...");
    }

    // Teardown - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Tearing down Calculator instance...");
    }

    // Test using AAA pattern
    @Test
    public void testMultiply() {
        // Arrange
        int a = 4;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        // Arrange
        int a = 10;
        int b = 2;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result);
    }
}