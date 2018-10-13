package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:48
 * 女娲类
 */
public class NvWa {
    public static void main(String[] args) {
        // 第一条生产线，男性生产线
        HumanFactory maleHumanFactory = new MaleFactory();
        // 第二条生产线，女性生产线
        HumanFactory femaleHumanFactory = new FemaleFactory();
        // 生产线建立完毕，开始生产人了：
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        System.out.println("-----生产一个黄色男性-----");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("-----生产一个黄色女性-----");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        System.out.println("-----生产一个黑色男性-----");
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        System.out.println("-----生产一个黑色女性-----");
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();
        Human maleWhiteHuman = maleHumanFactory.createWhiteHuman();
        System.out.println("-----生产一个白色男性-----");
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();
        System.out.println("-----生产一个白色女性-----");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
    }
}
