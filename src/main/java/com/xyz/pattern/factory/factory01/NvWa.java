package com.xyz.pattern.factory.factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:07
 * 女娲类
 */
public class NvWa {
    public static void main(String[] args) {
        // 声明阴阳八卦炉
        AbstractHumanFactory yinYangLu = new HumanFactory();
        // 女娲第一次造人，火候不足，于是白人产生了
        System.out.println("-----造出的第一批人是白种人-----");
        Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getcolor();
        whiteHuman.talk();
        // 女娲第二次造人，火候过足，于是黑人产生了
        System.out.println("-----造出的第二批人是黑种人-----");
        Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
        blackHuman.getcolor();
        blackHuman.talk();
        // 女娲第三次造人，火候刚刚好，于是黄种人产生了
        System.out.println("-----造出的第三批人是黄种人");
        Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getcolor();
        yellowHuman.talk();
    }
}
