package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:00
 * 白种人
 */
public class WhiteHuman extends Human {
    public void getColor() {
        System.out.println("白种人的皮肤是白色的");
    }

    public void talk() {
        System.out.println("白种人会说话，一般都是单字节");
    }
}
