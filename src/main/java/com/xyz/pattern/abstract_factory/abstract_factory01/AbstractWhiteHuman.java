package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:35
 * 白色人种
 */
public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("白种人的皮肤颜色是白色的");
    }

    public void talk() {
        System.out.println("白种人会说话，一般说的都是单字节");
    }
}
