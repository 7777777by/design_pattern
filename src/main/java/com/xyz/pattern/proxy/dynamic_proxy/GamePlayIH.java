package com.xyz.pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:29
 * 动态代理类.InvocationHandler是JDK提供的动态代理接口，对被代理类的方法进行代理
 */
public class GamePlayIH implements InvocationHandler {
    // 被代理者
    private Class cls;
    // 被代理的实例
    private Object obj;

    // 我要代理谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    // 调用被代理的方法
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //return method.invoke(this.obj, args);
        Object result = method.invoke(this.obj, args);
        // 如果是登录方法，则发送消息
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录");
        }
        return result;
    }
}
