package com.ghazimuhammad.calculator.operations;

public class Addition implements Operation {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
