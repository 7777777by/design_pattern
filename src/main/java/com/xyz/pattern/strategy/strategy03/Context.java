package com.xyz.pattern.strategy.strategy03;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:24
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator) {
        this.calculator = calculator;
    }

    public int exec(int a, int b) {
        return this.calculator.exec(a, b);
    }
}
