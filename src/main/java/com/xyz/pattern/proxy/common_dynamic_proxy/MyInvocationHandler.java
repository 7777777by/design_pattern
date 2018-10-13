package com.xyz.pattern.proxy.common_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:58
 * 动态代理的Handler类
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理的实例对象
    private Object target;

    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    // 代理方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行被代理的方法
        Object result = method.invoke(this.target, args);
        return result;
    }
}
