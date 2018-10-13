package com.xyz.pattern.abstract_factory.abstract_factory02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 20:07
 */
public class Creator1 extends AbstractCreator {
    // 只生产产品等级为1的A产品
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    // 只生产产品等级为1的B产品
    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
