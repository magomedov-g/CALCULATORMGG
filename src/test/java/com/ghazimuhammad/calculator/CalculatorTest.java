package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.Calculator;
import com.ghazimuhammad.calculator.calculator.HistoryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(91, Calculator.performOperation(89, 2, "+"));
    }

    @Test
    void testSubtractNumbers() {
        assertEquals(10, Calculator.performOperation(10, 0, "-"));
    }

    @Test
    void testAddWhithZero() {
        assertEquals(212, Calculator.performOperation(106, 2, "*"));
    }

    @Test
    void testDivideNumber() {
        assertEquals(20, Calculator.performOperation(100, 5, "/"));
    }
}
