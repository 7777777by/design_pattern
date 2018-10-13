package com.xyz.pattern.abstract_factory.abstract_factory02;

/**
 * @auth: liuyang
 * @date: 2018/9/15 20:04
 * 抽象工厂类
 * 有M个产品等级，就应该有M个实现工厂类
 */
public abstract class AbstractCreator {
    // 创建A产品家族
    public abstract AbstractProductA createProductA();
    // 创建B产品家族
    public abstract AbstractProductB createProductB();
    // 有N个产品族，则有N个创建方法...
}
