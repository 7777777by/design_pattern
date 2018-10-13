package com.xyz.pricinple.lsp.lsp02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:19
 * 场景类，士兵具体能捡到什么枪
 */
public class Client {
    public static void main(String[] args) {
        // 产生三毛这个士兵
        Soldier sanMao = new Soldier();
        // 三毛捡到一把步枪
        sanMao.setGun(new Rifle());
        // 三毛杀敌
        sanMao.killEnemy();
    }
}
