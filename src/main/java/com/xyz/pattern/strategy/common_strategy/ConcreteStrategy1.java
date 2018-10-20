package com.xyz.pattern.strategy.common_strategy;

/**
 * @auth: liuyang
 * @date: 2018/10/20 16:47
 */
public class ConcreteStrategy1 implements Strategy {
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
