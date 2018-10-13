package com.xyz.pattern.proxy.proxy05;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:22
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个代理玩家
        IGamePlayer proxy = new GamePlayerProxy("张三");
        // 记下开始时间
        System.out.println("开始时间是：2019-09-23 14:24");
        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2019-09-23 10:00");
    }
}
