
package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.history.HistoryCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HistroyManagerTest {

    @BeforeEach
    void setUp() {
        HistoryCalculator.clearHistory();
    }

    @Test
    void testAddHistory() {
        HistoryCalculator.addHistory("5 + 3 = 8");

        assertEquals(1, HistoryCalculator.operation.size());
    }

    @Test
    void testTwoOperations() {
        HistoryCalculator.addHistory("5 + 3 = 8");
        HistoryCalculator.addHistory("10 - 2 = 8");

        assertEquals(2, HistoryCalculator.operation.size());
    }

    @Test
    void testHistoryResult() {
        HistoryCalculator.addHistory("5 + 3 = 8");

        assertEquals("5 + 3 = 8",
                HistoryCalculator.operation.get(0));
    }

    @Test
    void testClearHistory() {
        HistoryCalculator.addHistory("10 + 5 = 15");

        HistoryCalculator.clearHistory();

        assertEquals(0, HistoryCalculator.operation.size());
    }

    @Test
    void testMaximumTenOperations() {
        for (int i = 0; i < 15; i++) {
            HistoryCalculator.addHistory("Operation " + i);
        }

        assertEquals(10, HistoryCalculator.operation.size());
    }

    @Test
    void testHelp() {
        String help = HistoryCalculator.help();

        assertTrue(help.contains("history"));
    }
}
