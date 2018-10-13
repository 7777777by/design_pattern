package com.xyz.pricinple.lsp.lsp02;

/**
 * @auth: liuyang
 * @date: 2018/9/9 14:17
 * 士兵类，使用枪支的对象
 */
public class Soldier {
    /**
     * 在类中调用其他类时务必要使用父类或接口
     * 如果不能使用父类或接口，则说明类的设计原则已经违背了LSP原则（里氏替换原则）
     * 里氏替换原则（LSP原则）：只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或异常
     */
    // 定义士兵的枪支
    private AbstractGun gun;

    // 给士兵一只枪
    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌...");
        gun.shoot();
    }
}
