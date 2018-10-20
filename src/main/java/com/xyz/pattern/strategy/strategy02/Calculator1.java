package com.xyz.pattern.strategy.strategy02;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:12
 * 简化算法
 */
public class Calculator1 {
    private static final String ADD_SYMBOL = "+";
    private static final String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
    }
}
