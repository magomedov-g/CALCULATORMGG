package com.ghazimuhammad.calculator.calculator;

import com.ghazimuhammad.calculator.Main;

import java.util.ArrayList;

public class HistoryCalculator {

    public static final ArrayList<String> operation = new ArrayList<>();

    public static void addHistory(String result) {
        operation.add(result);
        int size = operation.size();
        if (size > 10) {
            operation.remove(0);
        }
    }

    public static void showHustory() {
        if (operation.isEmpty()) {
            System.out.println("History cleared");
        } else {
            for (String resultHistory : operation) {
                System.out.println(resultHistory);
            }
        }
    }

    public static void clearHistory() {
        operation.clear();
    }

    public static void lastExample() {
        System.out.println(operation.get(operation.size() - 1));
    }
}
