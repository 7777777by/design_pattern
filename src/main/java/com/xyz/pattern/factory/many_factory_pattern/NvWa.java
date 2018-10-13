package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:07
 * 女娲类
 */
public class NvWa {
    public static void main(String[] args) {
        // 女娲第一次造人，火候不足，于是白人产生了
        System.out.println("-----造出的第一批人是白种人-----");
        Human whiteHuman = (WhiteHuman) new WhiteHumanFactory().createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        // 女娲第二次造人，火候过足，于是黑人产生了
        System.out.println("-----造出的第二批人是黑种人-----");
        Human blackHuman = (BlackHuman) new BlackHumanFactory().createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        // 女娲第三次造人，火候刚刚好，于是黄种人产生了
        System.out.println("-----造出的第三批人是黄种人");
        Human yellowHuman = (YellowHuman) new YellowHumanFactory().createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
