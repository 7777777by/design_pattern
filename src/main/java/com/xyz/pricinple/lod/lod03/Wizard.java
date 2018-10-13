package com.xyz.pricinple.lod.lod03;

import java.util.Random;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:30
 * 导向类
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    // 第一步
    public int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    // 第二步
    public int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    // 第三步
    public int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }
}
