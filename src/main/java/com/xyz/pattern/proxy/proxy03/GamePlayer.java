package com.xyz.pattern.proxy.proxy03;

/**
 * @auth: liuyang
 * @date: 2018/9/22 13:31
 * 普通代理的玩家
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    // 构造函数限制谁能够创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色！");
        } else {
            this.name = name;
        }
    }

    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的玩家" + this.name + "登录成功！");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    public void upgrade() {
        System.out.println(this.name + " 又升了一级");
    }
}
