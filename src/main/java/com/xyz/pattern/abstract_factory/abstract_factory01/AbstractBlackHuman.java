package com.xyz.pattern.abstract_factory.abstract_factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 19:37
 * 黑种人
 */
public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的");
    }

    public void talk() {
        System.out.println("黑种人会说话，一般人听不懂");
    }
}
