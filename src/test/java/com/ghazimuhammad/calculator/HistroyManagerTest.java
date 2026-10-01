package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.HistoryCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HistroyManagerTest {
    HistoryCalculator history = new HistoryCalculator();
    @Test
    void historyStoresOperations() {
        history.addHistory("5.0 + 3.0 = 8.0");
        assertEquals(3, history.operation.size());
    }
    @Test
    void historyCalculatotTest() {
        history.addHistory("23.0 - 22.0 = 1.0");
        history.addHistory("2.0 - 1.0 = 1.0");
        assertEquals(2, history.operation.size());
    }
        @Test
        void calculatorTestHistory() {
            history.addHistory("3.0 + 2.0 = 5,0");
            assertEquals(4, history.operation.size());
        }
            @Test
    void cleatedHistoryTest(){
        history.addHistory("34.0 + 6.0 = 40.0");
        HistoryCalculator.clearHistory();
        assertEquals(0, history.operation.size());
            }
    }
