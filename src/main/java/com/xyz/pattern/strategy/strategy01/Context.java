package com.xyz.pattern.strategy.strategy01;

/**
 * @auth: liuyang
 * @date: 2018/10/20 16:36
 * 锦囊
 */
public class Context {
    private IStrategy strategy;

    // 构造函数，你要使用哪个妙计
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    // 使用计谋了，看我出招了
    public void operat() {
        this.strategy.operate();
    }
}
