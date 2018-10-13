package com.xyz.pattern.factory.factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:02
 */
public class YellowHuman implements Human {
    public void getcolor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    public void talk() {
        System.out.println("黄种人会说话，一般说的都是双字节");
    }
}
