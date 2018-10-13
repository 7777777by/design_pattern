package com.xyz.pricinple.lsp.lsp03;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:43
 * 狙击枪类，继承步枪
 */
public class AUG extends Rifle {
    // 狙击枪都携带一个精准的望远镜
    public void zoomOut() {
        System.out.println("通过望远镜查看敌人...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG射击...");
    }
}
