package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:46
 * 生产男性的八卦炉
 */
public class MaleFactory implements HumanFactory {
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
