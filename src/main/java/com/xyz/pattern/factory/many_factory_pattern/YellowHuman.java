package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:02
 */
public class YellowHuman extends Human {
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    public void talk() {
        System.out.println("黄种人会说话，一般说的都是双字节");
    }
}
