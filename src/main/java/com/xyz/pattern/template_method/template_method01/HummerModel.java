package com.xyz.pattern.template_method.template_method01;

/**
 * @auth: liuyang
 * @date: 2018/9/16 15:45
 * 抽象悍马模型
 */
public abstract class HummerModel {
    // 这个模型要能够被发动起来，不管手动发动还是电力发动，实现在实现类里
    public abstract void start();
    // 能发动，还要能停下来
    public abstract void stop();
    // 喇叭会发出声音，是滴滴，还是哔哔
    public abstract void alarm();
    // 引擎会轰隆隆的响
    public abstract void engineBoom();
    // 要会跑
    //public abstract void run();
    // 将子类公用的代码提取出来，子类不需要单独实现，就是模板方法模式
    public void run() {
        // 发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 然后就开始跑了，中途遇见一条狗挡路，就按喇叭
        this.alarm();
        // 到达目的地就停车
        this.stop();
    }
}
