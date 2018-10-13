package com.xyz.pattern.proxy.proxy02;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:06
 */
public class Client {
    public static void main(String[] args) {
        // 先定义一个痴迷玩家
        IGamePlayer player = new GamePlayer("李四");
        // 再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-09-22 13:08");
        proxy.login("lisi", "123456");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录结束游戏时间
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
