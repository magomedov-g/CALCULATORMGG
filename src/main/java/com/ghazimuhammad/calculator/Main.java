package com.ghazimuhammad.calculator;

import java.util.Scanner;

public class Main {

    static final Scanner sc = new Scanner(System.in);

    public static final String ERROR_ARITHMETIC = "Error: cannot divide by zero";
    public static final String ERROR_FORMAT = "Error format exception";
    public static final String ENTER_NUMBER_PROMPT = "Enter an example: ";
    public static final String RESULT = "Result: ";

    public static void main(String[] args) {
        run();
    }

    public static void processInput(String input) {
        input = input.replaceAll("([*/+-])", " $1 ");
        String parts[] = input.trim().split("\\s+");

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        int answer = Calculator.performOperation(num1, num2, parts[1]);
        System.out.println(RESULT + num1 + " " + parts[1] + " " + num2 + " = " + answer);
    }

    public static void run() {
        System.out.print(ENTER_NUMBER_PROMPT);
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
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
            System.out.print(ENTER_NUMBER_PROMPT);
        }
    }
}