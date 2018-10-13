package com.xyz.pattern.proxy.proxy04;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:39
 * 强制代理的场景类
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个代练
//        IGamePlayer proxy = new GamePlayerProxy(player);
        // 获得指定的代理
        IGamePlayer proxy = player.getProxy();
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-09-22 13:41");
        proxy.login("zhangsan", "123456");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记下结束时间
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
