package com.xyz.pattern.factory.many_factory_pattern;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:01
 * 黑种人
 */
public class BlackHuman extends Human {
    public void getColor() {
        System.out.println("黑种人的皮肤是黑色的");
    }

    public void talk() {
        System.out.println("黑种人会说话，一般人听不懂");
    }
}