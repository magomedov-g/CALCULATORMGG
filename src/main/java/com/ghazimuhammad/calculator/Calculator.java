package com.ghazimuhammad.calculator;

public class Calculator {

    public static int performOperation(int a, int b, String symbol) {
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