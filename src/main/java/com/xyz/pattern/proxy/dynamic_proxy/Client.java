package com.xyz.pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:36
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer gamePlayer = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-09-22 14:49");
        // 获得类的ClassLoader
        ClassLoader cl = gamePlayer.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        // 登录
        proxy.login("zhangsan", "123456");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录游戏结束时间
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
