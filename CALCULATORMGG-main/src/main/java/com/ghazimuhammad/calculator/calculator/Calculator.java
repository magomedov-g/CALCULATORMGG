package com.ghazimuhammad.calculator.calculator;


import com.ghazimuhammad.calculator.Main;
import com.ghazimuhammad.calculator.operations.*;

import java.util.HashMap;

public class Calculator {


    public static double operationHashMapCalculator(double a, double b, String symbol) {


        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();

        HashMap<String, Operation> operationHashMap = new HashMap<>();

        operationHashMap.put("+", addition);
        operationHashMap.get("+");

        operationHashMap.put("-", subtraction);
        operationHashMap.get("-");

        operationHashMap.put("/", division);
        operationHashMap.get("/");

        operationHashMap.put("*", multiplication);
        operationHashMap.get("*");

        Operation op = operationHashMap.get(symbol);

        double result = op.execute(a, b);
        return result;
    }
}

