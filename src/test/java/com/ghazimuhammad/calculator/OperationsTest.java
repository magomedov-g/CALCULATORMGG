package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.operations.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    @Test
    void testAddition() {
        Addition addition = new Addition();

        assertEquals(8.0, addition.execute(5, 3));
    }

    @Test
    void testSubtraction() {
        Subtraction subtraction = new Subtraction();

        assertEquals(2.0, subtraction.execute(5, 3));
    }

    @Test
    void testMultiplication() {
        Multiplication multiplication = new Multiplication();

        assertEquals(15.0, multiplication.execute(5, 3));
    }

    @Test
    void testDivision() {
        Division division = new Division();

        assertEquals(2.5, division.execute(5, 2));
    }

    @Test
    void testDivisionByZero() {
        Division division = new Division();

        assertThrows(ArithmeticException.class,
                () -> division.execute(5, 0));
    }
}