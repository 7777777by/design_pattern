package com.xyz.pattern.proxy.common_dynamic_proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 15:01
 * 真实主题
 */
public class RealSubject implements Subject {
    // 业务操作
    public void doSomething(String str) {
        System.out.println("do something!--->" + str);
    }
}
