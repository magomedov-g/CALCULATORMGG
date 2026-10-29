package com.ghazimuhammad.calculator.calculator;


import com.ghazimuhammad.calculator.Main;
import com.ghazimuhammad.calculator.operations.*;

import java.util.HashMap;

public class Calculator {

    private static final HashMap<String, Operation> operationHashMap = new HashMap<>();

    private static final Addition addition = new Addition();
    private static final Subtraction subtraction = new Subtraction();
    private static final Division division = new Division();
    private static final Multiplication multiplication = new Multiplication();

    static {
        operationHashMap.put("+", addition);
        operationHashMap.put("-", subtraction);
        operationHashMap.put("/", division);
        operationHashMap.put("*", multiplication);
    }

    public static double operationHashMapCalculator(double a, double b, String symbol) {

        Operation op = operationHashMap.get(symbol);

        if (op == null) {
            throw new IllegalArgumentException();
        }
        double result = op.execute(a, b);
        return result;
    }
}

