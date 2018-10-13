package com.xyz.pattern.proxy.common_dynamic_proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 15:08
 * 前置通知
 */
public class BeforeAdvice implements IAdvice {
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
