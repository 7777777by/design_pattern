package com.xyz.pattern.strategy.strategy03;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:25
 */
public class AddCalculator implements Calculator {
    public int exec(int a, int b) {
        return a + b;
    }
}
