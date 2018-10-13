package com.xyz.pricinple.lsp.lsp01;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:13
 * 手枪类，继承枪类
 */
public class HandGun extends AbstractGun {
    // 手枪的特点是携带方便，射程短
    @Override
    public void shoot() {
        System.out.println("手枪射击...");
    }
}
