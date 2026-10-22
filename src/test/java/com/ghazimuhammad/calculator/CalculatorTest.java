package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(91, Calculator.operationHashMapCalculator(89, 2, "+"));
    }

    @Test
    void testSubtractNumbers() {
        assertEquals(10, Calculator.operationHashMapCalculator(10, 0, "-"));
    }

    @Test
    void testAddWhithZero() {
        assertEquals(212, Calculator.operationHashMapCalculator(106, 2, "*"));
    }

    @Test
    void testDivideNumber() {
        assertEquals(20, Calculator.operationHashMapCalculator(100, 5, "/"));
    }
}
