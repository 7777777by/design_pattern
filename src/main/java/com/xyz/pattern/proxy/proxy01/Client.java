package com.xyz.pattern.proxy.proxy01;

/**
 * @auth: liuyang
 * @date: 2018/9/22 12:58
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2019-09-22 13:01");
        player.login("zhangsan", "123456");
        // 开始打怪
        player.killBoss();
        // 升级
        player.upgrade();
        // 记录游戏结束时间
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
