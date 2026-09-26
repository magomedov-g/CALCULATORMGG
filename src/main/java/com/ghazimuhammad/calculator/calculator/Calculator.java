package com.ghazimuhammad.calculator.calculator;

public class Calculator {

    public static double performOperation(double a, double b, String symbol) {
        switch (symbol) {
            case "*":
                return (a * b);
            case "/":
                return (a / b);
            case "+":
                return (a + b);
            case "-":
                return (a - b);
            default:
                throw new IllegalStateException("Invalid input: ");
        }
    }
}