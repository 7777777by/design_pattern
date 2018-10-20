package com.xyz.pattern.strategy.strategy03;

/**
 * @auth: liuyang
 * @date: 2018/10/20 17:27
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new AddCalculator());
        context.exec(1, 2);
        context = new Context(new SubCalculator());
        context.exec(2, 1);
    }
}
