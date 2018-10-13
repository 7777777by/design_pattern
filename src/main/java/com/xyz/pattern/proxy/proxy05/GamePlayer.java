package com.xyz.pattern.proxy.proxy05;

/**
 * @auth: liuyang
 * @date: 2018/9/22 14:15
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        }
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    public void upgrade() {
        System.out.println(this.name + " 又升了一级");
    }
}
