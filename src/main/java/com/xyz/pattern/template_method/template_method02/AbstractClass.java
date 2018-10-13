package com.xyz.pattern.template_method.template_method02;

/**
 * @auth: liuyang
 * @date: 2018/9/16 16:13
 * 抽象模板类
 */
public abstract class AbstractClass {
    // 基本方法
    protected abstract void doSomething();
    // 基本方法
    protected abstract void doAnything();
    // 模板方法
    public void templateMethod() {
        /*
         * 调动基本方法，完成相关的逻辑
         */
        this.doSomething();
        this.doAnything();
    }
}
