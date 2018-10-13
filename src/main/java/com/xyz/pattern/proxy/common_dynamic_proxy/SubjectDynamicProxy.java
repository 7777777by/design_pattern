package com.xyz.pattern.proxy.common_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 15:18
 * 具体业务的动态代理
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        // 获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获得接口数组
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        // 获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
