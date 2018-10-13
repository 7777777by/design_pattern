package com.xyz.pricinple.lsp.lsp02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:15
 * 机枪类，继承枪类
 */
public class MachineGun extends AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射...");
    }
}
