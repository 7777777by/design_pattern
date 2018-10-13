package com.xyz.pattern.factory.factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 17:55
 * 抽象人类创建工厂
 */
public abstract class AbstractHumanFactory {
    /**
     * 通过使用泛型对输入参数产生两层限制：
     * 1.必须是Class类型
     * 2.必须是Heman的实现类
     */
    public abstract <T extends Human> T createHuman(Class<T> c);
}
