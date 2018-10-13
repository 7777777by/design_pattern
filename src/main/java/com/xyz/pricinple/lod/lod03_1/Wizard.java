package com.xyz.pricinple.lod.lod03_1;

import java.util.Random;

/**
 * @auth: liuyang
 * @date: 2018/9/12 20:38
 * 导向类
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    // 第一步
    private int first() {
        System.out.println("执行第一个方法...");
        return rand.nextInt(100);
    }

    // 第二步
    private int second() {
        System.out.println("执行第二个方法...");
        return rand.nextInt(100);
    }

    // 第三步
    private int third() {
        System.out.println("执行第三个方法...");
        return rand.nextInt(100);
    }

    public void installWizard() {
        int first = this.first();
        // 根据first返回的结果，判断是否需要执行second
        if (first > 50) {
            int second = this.second();
            if (second > 50) {
                int third = this.third();
                if (third > 50) {
                    this.first();
                }
            }
        }
    }
}
