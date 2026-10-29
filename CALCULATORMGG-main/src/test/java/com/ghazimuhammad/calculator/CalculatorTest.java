package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(8.0,
                Calculator.operationHashMapCalculator(5, 3, "+"));
    }

    @Test
    void testSubtraction() {
        assertEquals(2.0,
                Calculator.operationHashMapCalculator(5, 3, "-"));
    }

    @Test
    void testMultiplication() {
        assertEquals(15.0,
                Calculator.operationHashMapCalculator(5, 3, "*"));
    }

    @Test
    void testDivision() {
        assertEquals(2.5,
                Calculator.operationHashMapCalculator(5, 2, "/"));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-2.0,
                Calculator.operationHashMapCalculator(-5, 3, "+"));
    }

    @Test
    void testDoubleNumbers() {
        assertEquals(6.5,
                Calculator.operationHashMapCalculator(5.5, 1, "+"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> Calculator.operationHashMapCalculator(5, 0, "/"));
    }

    @Test
    void testUnknownOperator() {
        assertThrows(IllegalArgumentException.class,
                () -> Calculator.operationHashMapCalculator(5, 3, "%"));
    }
}