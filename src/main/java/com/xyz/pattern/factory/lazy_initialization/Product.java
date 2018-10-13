package com.xyz.pattern.factory.lazy_initialization;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:16
 * 抽象产品类
 */
public abstract class Product {
    // 产品类的公共方法
    public void method1() {
        // 业务逻辑处理
    }

    // 抽象方法
    public abstract void method2();
}
