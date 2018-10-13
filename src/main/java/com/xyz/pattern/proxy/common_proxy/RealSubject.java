package com.xyz.pattern.proxy.common_proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:15
 * 真实主题类：被代理角色，是业务逻辑的具体执行者
 */
public class RealSubject implements Subject {
    public void request() {
        // 业务逻辑处理
    }
}
