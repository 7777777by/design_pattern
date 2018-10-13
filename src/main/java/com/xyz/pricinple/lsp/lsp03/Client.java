package com.xyz.pricinple.lsp.lsp03;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:19
 * 场景类，士兵具体能捡到什么枪
 */
public class Client {
    /**
     * 有子类出现的地方父类未必就可以出现
     */
    public static void main(String[] args) {
        // 产生三毛这个狙击手
        Snipper sanMao = new Snipper();
        // 三毛捡到一把步枪
        sanMao.setAug((AUG) new Rifle());
//        sanMao.setAug(new AUG());
        // 三毛杀敌
        sanMao.killEnemy();
    }
}
