package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:57
 * 白种人创建工厂
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
