package com.xyz.pattern.factory.factory02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:24
 * 场景类
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        creator.createProduct(ConcreteProduct1.class);
        // 继续业务处理
        creator.createProduct(ConcreteProduct2.class);
        // 继续业务处理
    }
}
