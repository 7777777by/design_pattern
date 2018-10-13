package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:46
 * 生产女性的八卦炉
 */
public class FemaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
