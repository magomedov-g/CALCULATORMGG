package com.ghazimuhammad.calculator;

import com.ghazimuhammad.calculator.calculator.Calculator;
import com.ghazimuhammad.calculator.calculator.HistoryCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);

    public static final String ERROR_ARITHMETIC = "Error: cannot divide by zero";
    public static final String ERROR_FORMAT = "Error format exception";
    public static final String ENTER_NUMBER_PROMPT = "Enter an example: ";
    public static final String RESULT = "Result: ";
    public static final String HISTORY_CLEARED = "History cleared.....";

    public static void main(String[] args) {
        run();
    }

    public static void processInput(String input) {
        input = input.replaceAll("([*/+-])", " $1 ");
        String parts[] = input.trim().split("\\s+");

        double num1 = Integer.parseInt(parts[0]);
        double num2 = Integer.parseInt(parts[2]);
        double answer = Calculator.performOperation(num1, num2, parts[1]);
        String result  = num1 + " " + parts[1] + " " + num2 + " = " + answer;
        HistoryCalculator.addHistory(result);
        System.out.println(RESULT + result);
    }
    public static void run() {
        System.out.print(ENTER_NUMBER_PROMPT);
        while (true) {
            String input = sc.nextLine().toLowerCase();
            if (input.equalsIgnoreCase("exit")) break;
            switch (input){
                case "last":
                    HistoryCalculator.lastExample();
                    break;
                case "clear":
                    HistoryCalculator.clearHistory();
                    System.out.println(HISTORY_CLEARED);
                    break;
                case "history":
                    HistoryCalculator.showHistory();
                    break;
                case "help":
                    System.out.print(HistoryCalculator.help());
                    break;
                default:
                try {
                    processInput(input);
                } catch (IllegalStateException e) {
                    System.out.println(ERROR_FORMAT);
                } catch (NumberFormatException e) {
                    System.out.println(ERROR_FORMAT);
                } catch (ArithmeticException e) {
                    System.out.println(ERROR_ARITHMETIC);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(ERROR_FORMAT);
                }
            }System.out.print(ENTER_NUMBER_PROMPT);
        }
    }
}