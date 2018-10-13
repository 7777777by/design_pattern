package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:55
 * 黄种人创建工厂
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
