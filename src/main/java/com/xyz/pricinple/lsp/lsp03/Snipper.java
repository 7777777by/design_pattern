package com.xyz.pricinple.lsp.lsp03;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:45
 * 狙击手
 */
public class Snipper {
    private AUG aug;

    public void setAug(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy() {
        // 首先看看敌人的情况，别杀死敌人，自己也被人干掉
        aug.zoomOut();
        // 开始射击
        aug.shoot();
    }
}
