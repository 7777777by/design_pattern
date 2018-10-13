package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:38
 * 黄种人
 */
public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    public void talk() {
        System.out.println("黄种人会说话，一般说的都是双字节");
    }
}
