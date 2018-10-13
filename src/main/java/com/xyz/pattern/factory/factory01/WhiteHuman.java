package com.xyz.pattern.factory.factory01;

/**
 * @auth: liuyang
 * @date: 2018/9/15 18:00
 * 白种人
 */
public class WhiteHuman implements Human {
    public void getcolor() {
        System.out.println("白种人的皮肤是白色的");
    }

    public void talk() {
        System.out.println("白种人会说话，一般都是单字节");
    }
}
