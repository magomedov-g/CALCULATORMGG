package com.ghazimuhammad.calculator.history;

import com.ghazimuhammad.calculator.Main;
import com.ghazimuhammad.calculator.calculator.Calculator;

import java.util.ArrayList;

public class HistoryCalculator {

    public static final ArrayList<String> operation = new ArrayList<>();
    private static double lastNum1;
    private static double lastNum2;
    private static String lastSymbol;

    public static void addHistory(String result,
                                  String symbol,
                                  double num1,
                                  double num2
    ) {
        operation.add(result);
        int size = operation.size();
        if (size > 10) {
            operation.remove(0);

        }
        lastNum1 = num1;
        lastNum2 = num2;
        lastSymbol = symbol;
    }

    public static void showHistory() {
        if (operation.isEmpty()) {
            System.out.println(Main.HISTORY_ISEMPTY);
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

        if (operation.isEmpty()) {
            System.out.println(Main.HISTORY_ISEMPTY);
            return;
        }
        double answer = Calculator.operationHashMapCalculator(lastNum1, lastNum2, lastSymbol);
        String lastresult = lastNum1 + " " + lastSymbol + " " + lastNum2 + " = " + answer;
        System.out.println(lastresult);
        addHistory(lastresult, lastSymbol, lastNum1, lastNum2);
    }

    public static String help() {
        return """
                 Доступные команды:
                
                <число> <оператор> <число>
                
                        Операторы:
                        +  сложение
                        -  вычитание
                        *  умножение
                        /  деление
                
                Дополнительные команды:
                history  — показать историю
                last     — повторить последнюю операцию
                clear    — очистить историю
                exit     — выход
                """;
    }
}
