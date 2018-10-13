package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:57
 * 黑种人创建工厂
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
