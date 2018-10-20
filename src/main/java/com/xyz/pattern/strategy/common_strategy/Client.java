package com.xyz.pattern.strategy.common_strategy;

/**
 * @auth: liuyang
 * @date: 2018/10/20 16:51
 */
public class Client {
    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        // 声明一个上下文对象
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnything();
    }
}
