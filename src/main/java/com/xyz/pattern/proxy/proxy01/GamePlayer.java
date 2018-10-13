package com.xyz.pattern.proxy.proxy01;

/**
 * @auth: liuyang
 * @date: 2018/9/22 12:56
 * 玩家
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    public void upgrade() {
        System.out.println(this.name + " 又升了一级");
    }
}
