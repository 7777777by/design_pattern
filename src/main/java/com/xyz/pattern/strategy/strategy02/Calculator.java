package com.xyz.pattern.strategy.strategy02;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:01
 */
public class Calculator {
    private static final String ADD_SYMBOL = "+";
    private static final String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        int result = 0;
        if (ADD_SYMBOL.equals(symbol)) {
            result = this.add(a, b);
        } else if (SUB_SYMBOL.equals(symbol)) {
            result = this.sub(a, b);
        }
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }
}
