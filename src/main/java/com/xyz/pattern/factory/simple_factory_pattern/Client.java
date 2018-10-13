package com.xyz.pattern.factory.simple_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:44
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        ConcreteProduct1 concreteProduct1 = Creator.createProduct(ConcreteProduct1.class);
        // 处理业务逻辑
        concreteProduct1.method2();
        ConcreteProduct2 concreteProduct2 = Creator.createProduct(ConcreteProduct2.class);
        // 处理业务逻辑
        concreteProduct2.method2();
    }
}
