package com.ghazimuhammad.calculator.operations;


public class Division implements Operation {
    @Override
    public double execute(double a, double b) {
        if (b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }
}
