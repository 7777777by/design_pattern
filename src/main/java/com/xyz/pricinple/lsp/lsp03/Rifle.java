package com.xyz.pricinple.lsp.lsp03;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:14
 * 步枪类，继承枪类
 */
public class Rifle extends AbstractGun {
    // 步枪的特点是射程远，威力大
    @Override
    public void shoot() {
        System.out.println("步枪射击...");
    }
}
