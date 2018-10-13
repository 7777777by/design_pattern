package com.xyz.pattern.proxy.proxy03;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:39
 * 普通代理的场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个代练
        IGamePlayer player = new GamePlayerProxy("张三");
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-09-22 13:41");
        player.login("zhangsan", "123456");
        // 开始杀怪
        player.killBoss();
        // 升级
        player.upgrade();
        // 记下结束时间
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
