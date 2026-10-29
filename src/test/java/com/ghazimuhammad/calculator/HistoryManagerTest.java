package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.history.HistoryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HistoryManagerTest {

    @BeforeEach
    void setUp() {
        HistoryCalculator.clearHistory();
    }

    @Test
    void testAddHistory() {
        HistoryCalculator.addHistory("5 + 3 = 8", "+", 5, 3);

        assertEquals(1, HistoryCalculator.operation.size());
    }

    @Test
    void testClearHistory() {
        HistoryCalculator.addHistory("5 + 3 = 8", "+", 5, 3);

        HistoryCalculator.clearHistory();

        assertEquals(0, HistoryCalculator.operation.size());
    }

    @Test
    void testLast() {
        HistoryCalculator.addHistory("5 + 3 = 8", "+", 5, 3);

        HistoryCalculator.lastExample();

        assertEquals(2, HistoryCalculator.operation.size());
    }

    @Test
    void testMaximumTen() {
        for (int i = 0; i < 15; i++) {
            HistoryCalculator.addHistory("Example", "+", 5, 3);
        }

        assertEquals(10, HistoryCalculator.operation.size());
    }
}