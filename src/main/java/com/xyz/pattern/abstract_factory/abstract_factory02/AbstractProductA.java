package com.xyz.pattern.abstract_factory.abstract_factory02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 20:01
 * 抽象产品类A
 */
public abstract class AbstractProductA {
    // 每个产品共有的方法
    public void shareMethod() {}

    // 每个产品相同方法，不同实现
    public abstract void doSomething();
}
