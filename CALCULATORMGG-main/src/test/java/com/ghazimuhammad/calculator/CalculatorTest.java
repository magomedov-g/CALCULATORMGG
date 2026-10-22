
package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        assertEquals(91.0,
                Calculator.operationHashMapCalculator(89, 2, "+"));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(7.0,
                Calculator.operationHashMapCalculator(10, 3, "-"));
    }

    @Test
    void shouldMultiplyNumbers() {
        assertEquals(212.0,
                Calculator.operationHashMapCalculator(106, 2, "*"));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(20.0,
                Calculator.operationHashMapCalculator(100, 5, "/"));

    }

    @Test
    void shouldThrowExceptionForUnknownOperator() {
        assertThrows(NullPointerException.class,
                () -> Calculator.operationHashMapCalculator(5, 2, "%"));
    }
}
